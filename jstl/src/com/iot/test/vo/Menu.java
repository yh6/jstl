package com.iot.test.vo;

public class Menu {
	private int mNum;
	private String mName;
	private String mUrl;
	private String mDesc;
	@Override
	public String toString() {
		return "Menu [mNum=" + mNum + ", mName=" + mName + ", mUrl=" + mUrl + ", mDesc=" + mDesc + "]";
	}
	public int getmNum() {
		return mNum;
	}
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmUrl() {
		return mUrl;
	}
	public void setmUrl(String mUrl) {
		this.mUrl = mUrl;
	}
	public String getmDesc() {
		return mDesc;
	}
	public void setmDesc(String mDesc) {
		this.mDesc = mDesc;
	}

}
