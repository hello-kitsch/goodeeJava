package com.student.run;

import com.student.controller.StudentController;
/*
 * static import
 * static 메소드에 관해서 클래스명을 생략가능
 */
import static com.student.controller.StudentController.getController;
public class Main {

	public static void main(String[] args) {
//		StudentController.getController().mainView(); 
		getController().mainView(); 
	}

}