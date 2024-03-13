package com.student.controller;

import com.student.model.dao.Dao;
import com.student.model.dao.SearchCheck;
import com.student.model.dao.StudentDao;
import com.student.model.vo.Person;
import com.student.view.MainView;
import com.student.view.StudentMainView;

public class StudentController extends PersonController {

	public StudentController(MainView view, Dao dao) {
		super(view, dao);
	}
	
	@Override
	public void search() {
		int num = 1;
		Person[] psn = null;
		t:
		while(num == 1) {
			num = view.searchMetaInfo();
			switch(num) {
				case 1: //번호
					view.printMsg("번호 입력: ");
					psn = ((StudentDao)dao).searchHow(num, view.inputInt()); break t;
				case 2: //이름
					view.printMsg("이름 입력: ");
					psn = ((StudentDao)dao).searchHow(num, view.inputString()); break t;
				case 3: //학년
					view.printMsg("학년 입력: ");
					psn = ((StudentDao)dao).searchHow(num, view.inputInt()); break t;
				case 4: //주소
					view.printMsg("주소 입력: ");
					psn = ((StudentDao)dao).searchHow(num, view.inputString()); break t;
				case 5: //성별
					view.printMsg("성별 입력: ");
					psn = ((StudentDao)dao).searchHow(num, view.inputString()); break t;
				case 6: //나이
					view.printMsg("몇 살 이상?: ");
					int age1 = view.inputInt();
					view.printMsg("몇 살 이하?: ");
					int age2 = view.inputInt();
					int[] ages = new int[] {age1, age2};
					psn = ((StudentDao)dao).searchHow(num, ages); break t;
				default: view.printErrMsg(); 
			}
		}
		if(psn != null)
			view.printObj(psn);
	}
}
