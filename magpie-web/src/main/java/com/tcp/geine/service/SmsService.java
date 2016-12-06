package com.tcp.geine.service;

import java.util.Date;
import java.util.List;

import com.tcp.geine.vo.Sms;

public interface SmsService {

	public void sendSms(Sms sms);
	public void sendMultiSms(Sms sms);
	public List<Sms> getRecentlySmsList();
	public void removeReserveSms(Sms sms);
	public List<Sms> getSmsList(Date startDate, Date endDate);
	
}
