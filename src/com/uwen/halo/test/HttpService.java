package com.uwen.halo.test;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

public class HttpService {

	public static String getGetResponse(String url){
		HttpClient ht = initHttpClient(5000,5000);
		String s = getHttpGetResult(url,ht);
		return s;
	}
	
	public static HttpClient initHttpClient(int connect_time_out,
			int so_time_out) {
		HttpParams params = new BasicHttpParams();
		HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
		HttpProtocolParams.setContentCharset(params, "UTF-8");
		HttpProtocolParams.setUseExpectContinue(params, true);
		HttpConnectionParams.setConnectionTimeout(params, connect_time_out);
		HttpConnectionParams.setSoTimeout(params, so_time_out);
		SchemeRegistry schReg = new SchemeRegistry();
		schReg.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
		schReg.register(new Scheme("https",SSLSocketFactory.getSocketFactory(), 443));
		ClientConnectionManager conMgr = new ThreadSafeClientConnManager(params, schReg);
		return new DefaultHttpClient(conMgr, params);
	}
	 /**
     * 
     * @param url
     * @param httpClient
     * @return
     */
    public static String getHttpGetResult(String url,HttpClient httpClient){
    	
	    	try{
	  		     HttpGet  ps=new HttpGet();
	  		     ps.setURI(new URI(url));
//	  		   StringEntity se = new StringEntity(jsonObj.toString(), "UTF-8");
//				se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,
//						"application/json;charset=utf-8"));
//				post.addHeader("Content-Type", "application/json;charset=utf-8");
	  		     ps.addHeader("Content-Type", "text/html; charset=UTF-8");
		    	 HttpResponse response=httpClient.execute(ps);
		    	 if(response.getStatusLine().getStatusCode() != HttpStatus.SC_OK){
		    		  return null;
		    	 }else{
		    		  return EntityUtils.toString(response.getEntity());
		    	 }
		    	 
	  	}catch(Exception ex){
	  		ex.printStackTrace();
	  	}
	  	return null;
    }
    
    
public static String getPostResult(String url,Map<String,String> paramMap ,HttpClient httpClient){
    	try{
		    	 HttpPost  ps=new HttpPost();
		    	 ps.setURI(new URI(url));
		    	 List<NameValuePair> pairs=new ArrayList<NameValuePair>();
		    	 for(Entry<String,String> entry:paramMap.entrySet()){
		    	     pairs.add(new BasicNameValuePair(entry.getKey(),entry.getValue()));
		    	 }
		    	 ps.setEntity(new UrlEncodedFormEntity(pairs,HTTP.UTF_8));
		    	 HttpResponse response=httpClient.execute(ps);
		    	 String res=EntityUtils.toString(response.getEntity()); 
		    	 return  res;
	   	}catch(Exception ex){
	   		ex.printStackTrace();
	   		
	   	}
   	return null;
    }
}
