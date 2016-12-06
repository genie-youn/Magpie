package com.tcp.geine.vo;

import java.util.Date;

public class Sms {

	private String applicationName;
	private String receiveNumber;
	private String content;
	private Date reserveDate;
	private String sendNumber;
	
	public Sms(String applicationName, String receiveNumber, String content, Date reserveDate, String sendNumber) {
		
		if (applicationName == null) throw new NullPointerException("applicationName is not null");
		if (receiveNumber == null) throw new NullPointerException("receiveNumber is not null");
		
		this.applicationName = applicationName;
		this.receiveNumber = receiveNumber;
		this.content = content;
		this.reserveDate = reserveDate;
		this.sendNumber = sendNumber;
	}
	
	public Sms(){
		super();
	};

	public String getApplicationName() {
		return applicationName;
	}

	public String getReceiveNumber() {
		return receiveNumber;
	}

	public String getContent() {
		return content;
	}

	public Date getReserveDate() {
		return reserveDate;
	}

	public String getSendNumber() {
		return sendNumber;
	}
	
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public void setReceiveNumber(String receiveNumber) {
		this.receiveNumber = receiveNumber;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setReserveDate(Date reserveDate) {
		this.reserveDate = reserveDate;
	}

	public void setSendNumber(String sendNumber) {
		this.sendNumber = sendNumber;
	}

	@Override
	public String toString() {
		return "Sms [applicationName=" + applicationName + ", receiveNumber=" + receiveNumber + ", content=" + content
				+ ", reserveDate=" + reserveDate + ", sendNumber=" + sendNumber + "]";
	}
	
}
