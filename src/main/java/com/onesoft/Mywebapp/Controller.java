package com.onesoft.Mywebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/getmyname")
	public String getMyName() {
		return "Naveen";
	}

}
