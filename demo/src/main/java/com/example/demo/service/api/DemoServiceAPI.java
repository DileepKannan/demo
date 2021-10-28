package com.example.demo.service.api;

import org.springframework.web.bind.annotation.RequestMapping;

public interface DemoServiceAPI {
	
	@RequestMapping("/get")
	public String get();

}
