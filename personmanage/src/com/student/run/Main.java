package com.student.run;

import com.student.controller.StudentController;
import com.student.model.dao.StudentDao;
import com.student.view.StudentMainView;

public class Main {

	public static void main(String[] args) {
		StudentController ctrl = new StudentController(new StudentMainView(), new StudentDao());
		ctrl.mainView();
//		ctrl.mainViewEmployee();
//		ctrl.mainViewTeacher();
	}

}