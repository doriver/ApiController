package com.example.demo.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class AA {

	@RequestMapping("/aa")
	public String aabb(@Validated @RequestBody Form01 form, BindingResult br ) {
		
		if (br.hasErrors()) {
			log.info("검증 오류 발생 {}",br);			
		}
		
		return "1";
	}
}
