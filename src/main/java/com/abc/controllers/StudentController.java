package com.abc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dto.StudentDto;
import com.abc.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService student;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public StudentDto getStudentInfo(@RequestParam Long id) {
		return student.setStudentInfo(id);
	}

	
}
