package com.sinosoft;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class HelloController {

	@ApiOperation("hello test")
	@RequestMapping("/")
	public String index() {
		
		return "Hello Spring Boot!";
	}
}
