package com.example.demo.service.impl;

import org.springframework.stereotype.Component;

import com.example.demo.service.api.DemoServiceAPI;

@Component
public class DemoImpl implements DemoServiceAPI{

	@Override
	public String get() {
		return "Hello World";
	}
	
}
