package com.mohib.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// this is an annotation... in Angular we use decorators...
@RestController
public class HelloController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello() {
		return "hello <h1>Html also works; that is awesome...</h1>";
		
	}
}
