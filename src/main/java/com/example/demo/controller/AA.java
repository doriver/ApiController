package com.example.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AA {

	@RequestMapping("/aa")
	public String aabb(@Validated @RequestBody Form01 form ) {
		return "1";
	}
}
