package com.tcp.geine.vo;

import java.util.Date;

public final class Sms {

	private final String applicationName;
	private final String receiveNumber;
	private final String content;
	private final Date reserveDate;
	private final String sendNumber;
	
	public Sms(String applicationName, String receiveNumber, String content, Date reserveDate, String sendNumber) {
		
		if (applicationName == null) throw new NullPointerException("applicationName is not null");
		if (receiveNumber == null) throw new NullPointerException("receiveNumber is not null");
		
		this.applicationName = applicationName;
		this.receiveNumber = receiveNumber;
		this.content = content;
		this.reserveDate = reserveDate;
		this.sendNumber = sendNumber;
	}

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

	@Override
	public String toString() {
		return "Sms [applicationName=" + applicationName + ", receiveNumber=" + receiveNumber + ", content=" + content
				+ ", reserveDate=" + reserveDate + ", sendNumber=" + sendNumber + "]";
	}
	
}
