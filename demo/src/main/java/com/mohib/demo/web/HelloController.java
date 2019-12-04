package com.mohib.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// this is an annotation... in Angular we use decorators...
@RestController
@RequestMapping("/greeting")
public class HelloController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello() {
		return "hello world <h1>Html also works; that is awesome...</h1>";
	}

	// ****************************************************************************
	// ************ This is for POST request **************************************
	@RequestMapping("/user_entry") 
	public String userForm() {
		return 
		"<form action=\"/greeting/user_greeting\" method=\"POST\">\n" + 
		"  First name:<br>\n" + 
		"  <input type=\"text\" name=\"firstname\" value=\"Mickey\">\n" + 
		"  <br>\n" + 
		"  Last name:<br>\n" + 
		"  <input type=\"text\" name=\"lastname\" value=\"Mouse\">\n" + 
		"  <br><br>\n" + 
		"  <input type=\"submit\" value=\"Submit\">\n" + 
		"</form>";
	}
	
	@RequestMapping(value="/user_greeting", method = RequestMethod.POST)
	public String printUserGreeting(@RequestParam String firstname, @RequestParam String lastname) {
		return "Form submitted..." + 
				"<br>" + "Hello there, " + 
				firstname + " " + lastname + 
				". How are you?....";
	}
	// ****************************************************************************
	// ****************************************************************************
	

	
//	// ****************************************************************************
//	// ************ This is for GET request for Query Parameter... ****************
//	@RequestMapping("/user_entry") 
//	public String userForm() {
//		return 
//		"<form action=\"/greeting/user_greeting\" method=\"GET\">\n" + 
//		"  First name:<br>\n" + 
//		"  <input type=\"text\" name=\"firstname\" value=\"Mickey\">\n" + 
//		"  <br>\n" + 
//		"  Last name:<br>\n" + 
//		"  <input type=\"text\" name=\"lastname\" value=\"Mouse\">\n" + 
//		"  <br><br>\n" + 
//		"  <input type=\"submit\" value=\"Submit\">\n" + 
//		"</form>";
//	}
//	
//	@RequestMapping(value="/user_greeting", method = RequestMethod.GET)
//	public String printUserGreeting(@RequestParam String firstname, @RequestParam String lastname) {
//		return "Form submitted..." + 
//				"<br>" + "Hello there, " + 
//				firstname + " " + lastname + 
//				". How are you?....";
//	}
//	// ****************************************************************************
//	// ****************************************************************************

	
	
//	// ****************************************************************************
//  // Path variable.... **********************************************************
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
	public String getOrder(@PathVariable String id) {
		return "Order ID: " + id;
	}
	
	
//	// ****************************************************************************
//	// ****************************************************************************

	
}




