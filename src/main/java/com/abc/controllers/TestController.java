package com.abc.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dto.StudentDto;

@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showTest() {

		return "TEST";

	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void setStudent(@RequestBody StudentDto dto) {
		System.out.println(dto.toString());

	}

}
