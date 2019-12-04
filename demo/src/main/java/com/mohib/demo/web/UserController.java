package com.mohib.demo.web;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/{userId}")
	public String displayUser(@PathVariable int userId) {
		return "User Found: " + userId;
	}
	
	@RequestMapping("/{userId}/invoices")
	public String displayUserInvoice(@PathVariable int userId, @RequestParam Date date) {
		return "Invoice found for user : " + userId + " on the date: " + date;
	}
}
