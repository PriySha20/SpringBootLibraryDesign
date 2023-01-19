package com.greatlearning.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.serviceImpl.ServiceImplementation;

//@Controller
@RestController
public class ExampleController{

	@Autowired
	ServiceImplementation serviceImplementation;
	
	
	@GetMapping("/info")
//	@ResponseBody
	public GreatLearning get() {
//		GreatLearning greatLearning = new GreatLearning();
//		greatLearning.setCourseName("Full stack development");
//		greatLearning.setCourseType("online");
////		greatLearning.setInstructorName("E&ICT IIT ROORKEE");
//		return greatLearning;
		return serviceImplementation.get();
		
	}
	
	@PostMapping("customInfo")
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
//		GreatLearning greatLearning = new GreatLearning();
//		greatLearning.setCourseName(courseName);
//		greatLearning.setCourseType(courseType);
////		greatLearning.setInstructorName(instructorName);
//		return greatLearning;
		return serviceImplementation.customInfo(courseName, courseType, instructorName);
	}
}
