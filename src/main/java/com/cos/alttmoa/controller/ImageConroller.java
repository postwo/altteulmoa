package com.cos.alttmoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageConroller {

	@GetMapping("/image/story")
	public String story() {
		return "image/story";
	}
	
}
