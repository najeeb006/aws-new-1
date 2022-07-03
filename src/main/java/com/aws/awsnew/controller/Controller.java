package com.aws.awsnew.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.awsnew.model.Me;

@RestController
public class Controller {
	@GetMapping("")
	public String welcome() {
		return "Welcome to the world of magic";
	}
	@GetMapping("/details")
	public Me me() {
		return new Me("najeeb","rahman",24,"Saleena Manzil");
	}

}
