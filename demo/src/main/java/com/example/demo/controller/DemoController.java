package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.api.DemoServiceAPI;

@RestController
public class DemoController {

	private DemoServiceAPI api;

	public DemoController(DemoServiceAPI api) {
		this.api = api;
	}

	@RequestMapping("/get")
	public String getDetails() {
		String message = api.get();
		return message;
	}

}
