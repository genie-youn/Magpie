package com.tcp.geine.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

	private Logger LOG = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/")
	@ResponseBody
	public String doTest(){
		return "OK";
	}
}
