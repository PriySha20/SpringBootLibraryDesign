package com.greatlearning.library.serviceImpl;

import org.springframework.stereotype.Service;

import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.service.ExampleService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ServiceImplementation implements ExampleService {

	public GreatLearning get() {
		log.info("Inside get() method");
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("Full stack development");
		greatLearning.setCourseType("online");
//		greatLearning.setInstructorName("E&ICT IIT ROORKEE");
		return greatLearning;
	}
		
		public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
			log.info("Inside customInfo() method");
			GreatLearning greatLearning = new GreatLearning();
			greatLearning.setCourseName(courseName);
			greatLearning.setCourseType(courseType);
//			greatLearning.setInstructorName(instructorName);
			return greatLearning;
		}
}
