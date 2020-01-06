package com.abc.service;

import org.springframework.stereotype.Service;

import com.abc.dto.StudentDto;

@Service
public class StudentService {

	public StudentDto setStudentInfo(Long id) {
		StudentDto sd = new StudentDto();
		sd.setName("Abdul");
		sd.setPhoNum("090909009");
		sd.setMail("mn@yahoo.com");
		return sd;
	}

}
