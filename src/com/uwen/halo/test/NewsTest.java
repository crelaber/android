package com.uwen.halo.test;

import java.util.Random;

import org.json.JSONException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import android.test.AndroidTestCase;

public class NewsTest extends AndroidTestCase {

	public void test163News() throws JSONException{
//		String url = "http://c.m.163.com/nc/article/headline/T1348647909107/0-20.html";
//		String content = HttpService.getGetResponse(url);
//		JSONObject obj = new JSONObject(content);
//		JSONArray arr = obj.getJSONArray("T1348647909107");
//		String tmp = null;
//		JSONObject tmpObj;
//		JSONArray tmpArr = new JSONArray();
//		for(int i=0;i<arr.length();i++){
//			tmpObj = arr.getJSONObject(i);
//			if(tmpObj.has("url_3w")){
//				tmpArr.put(tmpObj);
//			}
//		}
////		System.out.println(tmpArr);
//		Type type= new TypeToken<List<News>>(){}.getType();
//		List<News> list = new Gson().fromJson(tmpArr.toString(), type);
//		System.out.println(new Gson().toJson(list));
	}
	
	public void testJoke() throws JSONException{
		String url = "http://www.jiecao.com";
		String content = HttpService.getGetResponse(url);
		Document doc =Jsoup.parse(content);
		Element ae = doc.select("a.end").get(0);
		String numStr = ae.attr("href");
		if(numStr.contains("/")){
			numStr = numStr.substring(numStr.lastIndexOf("/")+1);
			numStr = numStr.substring(0,numStr.lastIndexOf("."));
		}
		int pageNum = Integer.parseInt(numStr);
		int random = new Random().nextInt(pageNum);
		System.out.println("random====>"+random);
		
		url = url+"/list/"+random+".html";
		System.out.println(url);
		
		content = HttpService.getGetResponse(url);
		doc =Jsoup.parse(content);
//		System.out.println(doc);
		Elements listEle = doc.select("div.author");
		String jokeContent = "";
		String imgUrl = "";
		Element tmpEle  =null;
		for(Element el : listEle){
			tmpEle =el.select("div.authorContent a").get(0);
			jokeContent = tmpEle.text();
			System.out.println("jokeContent====>"+jokeContent);
			
			tmpEle =el.select("div.feed-img-lists a img").get(0);
			imgUrl = tmpEle.attr("src");
			System.out.println("imgUrl====>"+imgUrl);
		}
	}
	
}
