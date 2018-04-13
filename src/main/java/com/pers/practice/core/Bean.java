package com.pers.practice.core;

import com.pers.practice.core.DataType;

public class Bean {

	private String requestText;
	private DataType alertType;
	private String reqCount;
	
	public Bean(String requestText, DataType alertType) {
		this.requestText = requestText;
		this.alertType = alertType;
	}
	
	public Bean(String requestText) {
		this.requestText = requestText;
	}
	
	public String getRequestText() {
		return requestText;
	}
	public void setRequestText(String requestText) {
		this.requestText = requestText;
	}
	public DataType getAlertType() {
		return alertType;
	}
	public void setAlertType(DataType alertType) {
		this.alertType = alertType;
	}

	public String getReqCount() {
		return reqCount;
	}

	public void setReqCount(String reqCount) {
		this.reqCount = reqCount;
	}

	
	
	
}
