package com.example.demo.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.form.Form01;

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

	@RequestMapping("/t/rb")
	public Object ab(@RequestBody Form01 form) {
		return form;
	}	
/* 		POST요청 + @RequestBody에서
 * Content-Type	: application/x-www-form-urlencoded  >  HttpMediaTypeNotSupportedException
 * Content-Type	: application/json  >  정상처리
 */
	
	
	@RequestMapping("/t/ma")
	public Object aqqqa(@ModelAttribute Form01 form) {	
		return form;
	}
/* 		POST요청 + @ModelAttribute에서
 * Content-Type	: application/x-www-form-urlencoded  >  정상처리
 * Content-Type	: application/json  >  에러는 안나는데 실패, 객체에 데이터가 안실림 기본값(0, null)
 */	
}
