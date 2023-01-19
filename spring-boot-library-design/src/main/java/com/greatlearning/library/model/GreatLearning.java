package com.greatlearning.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

//@Getter
//@Setter
//@ToString


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GreatLearning {

	private String courseName;
	private String courseType;
//	private String instructorName;
	private FullName instructorName;
	
//	these constructors are created for telescoping design pattern(when builder is used then these are not needed)
	public GreatLearning(String courseName) {
		this.courseName = courseName;
	}


	public GreatLearning(String courseName, String courseType) {
		this.courseName = courseName;
		this.courseType = courseType;
	}
	

	
//	@Override
//	public String toString() {
//		return "GreatLearning [courseName=" + courseName + ", courseType=" + courseType + ", instructorName="
//				+ instructorName + "]";
//	}

	
}
