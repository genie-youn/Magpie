package com.tcp.geine.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcp.geine.service.SmsService;
import com.tcp.geine.vo.Sms;

@Controller
@RequestMapping("/sms")
public class SmsController {

	private Logger LOG = LoggerFactory.getLogger(SmsController.class);
	
	@Autowired
	private SmsService service;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String sendSms(@RequestBody Sms sms){
		try {
			service.sendSms(sms);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "OK";
	}
	
	
}
