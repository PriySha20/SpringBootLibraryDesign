package com.greatlearning.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.greatlearning.library.model.FullName;
import com.greatlearning.library.model.GreatLearning;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootLibraryDesignApplication implements CommandLineRunner{ 

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("hello spring-boot!...");
		System.out.println("hello dev-tools!...");
	}

	@Override
	public void run(String... args) throws Exception {
		GreatLearning greatlearning= new GreatLearning();
		greatlearning.setCourseName("Designing Microservices with Spring-Boot");
		greatlearning.setCourseType("Information Technology");
//		Sgreatlearning.setInstructorName("Manoj Tripathi");
		
//		GreatLearning greatlearning= new GreatLearning("Designing Microservices with Spring-Boot", "Information Technology", "Manoj Tripathi");
		System.out.println("Great Learning Object is" + greatlearning);
//		
//
//		System.out.println("Course is "+ greatlearning.getCourseName());
//		System.out.println("Course Type is "+ greatlearning.getCourseType());
//		System.out.println("Course is "+ greatlearning.getInstructorName());

//		greatlearning.setCourseName("Spring-Boot");
////		greatlearning.getCourseName();
//		
//		greatlearning.setCourseType("online");
//		greatlearning.setInstructorName("manoj tripathi");
//		System.out.println("the object has "+ greatlearning);
		
//		GreatLearning greatLearningUsingAllArgsConst = new GreatLearning("Designing micro services with spring boot", "IT", "Samarth Mali");
//		System.out.println("Great Learning with All Args Constructor"+ greatLearningUsingAllArgsConst);
//		
////		telescoping constructor design pattern
//		GreatLearning greatLearningTeleDesign = new GreatLearning("Learn creational design patterns", "IT");
//		System.out.println("Great Learning with Telescoping design patterns" + greatLearningTeleDesign);
//		
//		GreatLearning greatLearningOnlyCourseName = new GreatLearning("Onlycourse name to be printed");
//		System.out.println("Printing only course name using tele design pattern "+ greatLearningOnlyCourseName);
//		
//		
////		another object using builder keyword,, no constructors required for this type
////		no need to creating object actually, builder doesn't require creation of object
//		GreatLearning greatLearningUsingBuilderKeyword = GreatLearning.builder().courseName("Spring-boot using Builder")
//				.courseType("Information Tech....").instructorName("Banarasiya").build();
//		System.out.println("Implementing Builder Pattern "+ greatLearningUsingBuilderKeyword);
		
		
		
//		introduction to complex objects
		GreatLearning greatLearningUsingComplexObject = GreatLearning.builder().courseName("introduction to complex objects using builder pattern")
				.courseType("spring boot concept").instructorName(FullName.builder().firstName("Shivank").lastName("Singh").build()).build();
		
		System.out.println("Great Learning Complex Object Creation "+ greatLearningUsingComplexObject);
	
//	 service tier : it consists of a business logic
		
//	functional way of logging for printing complex object instead of using sysout
		log.info("Great Learning Complex Object Creation using lombok --> {}", greatLearningUsingComplexObject);
		
	}
	

}