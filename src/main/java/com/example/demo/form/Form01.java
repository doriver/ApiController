package com.example.demo.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Form01 {

	@NotBlank
	String name;
	
	
	int age;

	@Size(max = 4)
	String str01;
	
	
	int n01;
	
}
