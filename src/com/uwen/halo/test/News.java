package com.uwen.halo.test;

/**
 *网易新闻的实体类
 * @author user
 *
 */
public class News {
	
	/*{
        "adTitle": "网易新闻有态度！",
        "digest": "专家:公务员涨薪后百姓才会涨；红会:卖血传言失实。",
        "docid": "A6ON0O3J00964LQA",
        "imgsrc": "http://img3.cache.netease.com/3g/2014/9/22/2014092215264320f5e.jpg",
        "lmodify": "2014-09-22 15:18:45",
        "url_3w": "http://help.3g.163.com/14/0922/15/A6ON0O3J00964LQA.html",
        "ptime": "2014-09-22 15:01:22",
        "url": "http://3g.163.com/ntes/14/0922/15/A6ON0O3J00964LQA.html",
        "source": "网易新媒体",
        "subtitle": "",
        "title": "今日之声",
        "replyCount": 1546,
        "priority": 87
    },*/
	private String url_3w;  //网站页面
	private int replyCount;
	private String digest;  //概要
	private String adTitle; //广告标题
	private String url;  
	private String docid;
	private String title;
	private String source;
	private int priority;
	private String lmodify;
	private String imgsrc;
	private String subtitle;
	private String ptime;

	public String getUrl_3w() {
		return url_3w;
	}

	public void setUrl_3w(String url_3w) {
		this.url_3w = url_3w;
	}

	public int getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getAdTitle() {
		return adTitle;
	}

	public void setAdTitle(String adTitle) {
		this.adTitle = adTitle;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDocid() {
		return docid;
	}

	public void setDocid(String docid) {
		this.docid = docid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getLmodify() {
		return lmodify;
	}

	public void setLmodify(String lmodify) {
		this.lmodify = lmodify;
	}

	public String getImgsrc() {
		return imgsrc;
	}

	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getPtime() {
		return ptime;
	}

	public void setPtime(String ptime) {
		this.ptime = ptime;
	}

}
