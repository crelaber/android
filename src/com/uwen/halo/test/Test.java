package com.uwen.halo.test;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import android.test.AndroidTestCase;

import com.google.gson.Gson;

public class Test extends AndroidTestCase {

	public void testJsoup() {
//		String baseUrl = "http://apk.gfan.com";
//		String url = "http://apk.gfan.com/search/%E6%96%B0%E9%97%BB_1.shtml";
//		HttpClient ht = initHttpClient(5000,5000);
//		String s = getHttpGetResult(url,ht);
//		Document doc = Jsoup.parse(s);
//		Elements es = doc.select("ul.lp-app-list li");
//		int count = 0;
//		String downUrl ="";
//		String picUrl ="";
//		String appName = "";
//		Element tmpEle = null;
//		Document tmpDoc =null;
//		String downUrlStr= "";
//		List<SearchAppsVO> list = new ArrayList<SearchAppsVO>();
//		for(Element e :es){
//			if(count<10){
//				SearchAppsVO vo = new SearchAppsVO();
//				tmpEle = e.select("img.app-img2").get(0);
//				picUrl = tmpEle.attr("src");
//				vo.setAppImg(picUrl);
//				
//				tmpEle  = e.select("p").get(0).select("span.apphot-tit").get(0).select("a").get(0);
//				appName = tmpEle.text();
//				vo.setAppName(appName);
//				
//				tmpEle  = e.select("a").get(0);
//				downUrl =baseUrl+ tmpEle.attr("href");
//				downUrlStr =  getHttpGetResult(downUrl,ht);
//				tmpDoc = Jsoup.parse(downUrlStr);
//				tmpEle = tmpDoc.select("a#computerLoad").get(0);
//				downUrl = tmpEle.attr("href");
//				vo.setAppUrl(downUrl);
//				list.add(vo);
////				Log.e("downUrl address====>",downUrl);
////				Log.e("downUrl====>",downUrl);
////				Log.e("picUrl====>",picUrl);
////				Log.e("appName====>",appName);
//				count++;
//			}
//		}
//		Log.e("applist","appList===>"+new Gson().toJson(list));
	}
	
	/**
	 * 从百度搜索图片
	 * @throws UnsupportedEncodingException
	 * @throws JSONException
	 */
	public void testGetImageFromBaidu() throws UnsupportedEncodingException, JSONException{
//		String keyword = "刘德华";
//		String encode  = URLEncoder.encode(keyword, "UTF-8");
//		String url = "http://image.baidu.com/i?tn=resultjsonavatarnew&ie=utf-8&cg=star&pn=60&rn=60&z=&fr=&width=&height=&lm=-1&ic=0&s=0&word="+encode;
//		HttpClient ht = initHttpClient(5000,5000);
//		String s = getHttpGetResult(url,ht);
//		JSONObject obj = new JSONObject(s);
//		JSONArray arr = obj.getJSONArray("imgs");
//		JSONObject tmpObj = null;
//		String imgUrl = "";
//		for(int i=0;i<arr.length();i++){
//			tmpObj  = arr.getJSONObject(i);
//			imgUrl = tmpObj.getString("objURL");
//			System.out.println("imgUrl===>"+imgUrl);
//		}
//		
	}
	
	public  void atestGetMusicFromBaidu() throws UnsupportedEncodingException{
//		String keyword = "光良";
//		String encode  = URLEncoder.encode(keyword, "UTF-8");
//		String baseUrl = "http://music.baidu.com";
//		String url = "http://music.baidu.com/search/song?s=1&key="+encode;
//		String baseMusicUrl = "http://play.baidu.com/data/music/songlink?hq=1&type=mp3&rate=&pt=0&flag=-1&s2p=-1&prerate=-1&bwt=-1&dur=-1&bat=-1&bp=-1&pos=-1&auto=-1&songIds=";
//		String s = getGetResponse(url);
//		Document doc = Jsoup.parse(s);
//		Elements parentEle = doc.select("div.search-song-list ul").get(0).select("li");
//		String musicName  = "";
//		String musicUrl  = "";
//		String singer = "";
//		String musicId = "";
//		int count=0;
//		Element tempEle = null;
//		 tempEle = doc.select("div.cover-img").get(0);
//		 String imgUrl = tempEle.select("img").get(0).attr("src");
//		 List<MusicNewVO> list = new ArrayList<MusicNewVO>();
//		 for(Element e : parentEle){
//				tempEle = e.select("span.song-title a").get(0);
//				musicName = tempEle.text();
//				musicUrl = tempEle.attr("href");
//				musicId  = getMusicId(musicUrl);  //获取id
//				musicUrl = baseMusicUrl + musicId;
//				System.out.println("musicUrl===>"+musicUrl);
//				singer = e.select("span.author_list").get(0).attr("title");
//				MusicNewVO vo = new MusicNewVO(musicName,musicUrl,singer);
//				if(count==0){
//					vo.setMusicImageUrl(imgUrl);			
//				}else{
//					vo.setMusicImageUrl("");			
//				}
//				musicId = musicUrl.substring(musicUrl.lastIndexOf("=")+1);
//				vo.setMusicId(musicId);
//				list.add(vo);
//				count++;
//			}
//			System.out.println("list===>"+new Gson().toJson(list));
		}

		private static String getMusicId(String musicUrl){
			int start = 0;
			int end =0;
			String id = "";
			if(musicUrl.contains("/")){
				start =musicUrl.lastIndexOf("/")+1;
			}
			if(musicUrl.indexOf("#")>0){
				end =musicUrl.indexOf("#");
			}
			if(end!=0){
				id  = musicUrl.substring(start,end);
			}else{
				id = musicUrl.substring(start);
			}
			return id;
		}
		
		
	public void testGetPlayUrl() throws JSONException{
		String musicUrl = "http://play.baidu.com/data/music/songlink?hq=1&type=mp3&rate=&pt=0&flag=-1&s2p=-1&prerate=-1&bwt=-1&dur=-1&bat=-1&bp=-1&pos=-1&auto=-1&songIds=242696";
		String json = getGetResponse(musicUrl);
		JSONObject pObj = new JSONObject(json);
		JSONObject data = pObj.getJSONObject("data");
		JSONArray songList = data.getJSONArray("songList");
		JSONObject tmpObj = null;
		String playUrl = "";
		if(songList.length()>0){
			JSONObject musicObj = songList.getJSONObject(0);
			tmpObj = musicObj.getJSONObject("linkinfo");
			if(tmpObj!=null){
				tmpObj = tmpObj.getJSONObject("128");
				if(tmpObj!=null){
					playUrl = tmpObj.getString("songLink");
				}
			}
		}
		System.out.println(playUrl);
	}
	

	
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
