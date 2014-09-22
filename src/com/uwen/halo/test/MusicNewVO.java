package com.uwen.halo.test;

/**
 * 抓取百度音乐的
 * @author user
 *
 */
public class MusicNewVO {
	
	private String musicName;
	private String secondaryUrl;
	private String singer;
	private String musicImageUrl;
	private String musicId;
	
	public MusicNewVO() {
		super();
	}
	
	public MusicNewVO(String musicName, String secondaryUrl, String singer) {
		super();
		this.musicName = musicName;
		this.secondaryUrl = secondaryUrl;
		this.singer = singer;
	}
	
	public MusicNewVO(String musicName, String secondaryUrl, String singer,String musicImageUrl) {
		super();
		this.musicImageUrl = musicImageUrl;
		this.musicName = musicName;
		this.secondaryUrl = secondaryUrl;
		this.singer = singer;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	public String getSecondaryUrl() {
		return secondaryUrl;
	}
	public void setSecondaryUrl(String secondaryUrl) {
		this.secondaryUrl = secondaryUrl;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getMusicImageUrl() {
		return musicImageUrl;
	}
	public void setMusicImageUrl(String musicImageUrl) {
		this.musicImageUrl = musicImageUrl;
	}

	public String getMusicId() {
		return musicId;
	}

	public void setMusicId(String musicId) {
		this.musicId = musicId;
	}
	
	
}
