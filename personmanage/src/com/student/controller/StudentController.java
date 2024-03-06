package com.student.controller;

import com.student.model.dao.Dao;
import com.student.model.dao.SearchCheck;
import com.student.model.dao.StudentDao;
import com.student.model.vo.Person;
import com.student.view.MainView;
import com.student.view.StudentMainView;

public class StudentController implements PersonController {
	private MainView view;
	private Dao dao;
	
	public StudentController(MainView view, Dao dao) {
		this.view = view;
		this.dao = dao;
	}
	@Override
	public void mainView() {
		int num = 1;
		while(num != 0) {
			num = view.mainMenu();
			switch(num) {
				case 1: enroll(); break;
				case 2: showAll(); break;
				case 3: search(); break;
				case 4: edit(); break;
				case 5: delete(); break;
				default: view.printErrMsg();
			}
		}
		if(num == 0)
			view.printEndMsg();
	}
	@Override
	public void enroll() {
		boolean result = dao.enroll(view.inputNewInfo());
		view.printMsg(result?"등록성공":"등록실패");
	}
	@Override
	public void showAll() {
		view.printMsg(dao.showAll());
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
					view.printMsg("나이 입력: ");
					psn = ((StudentDao)dao).searchHow(num, view.inputInt()); break t;
				default: view.printEndMsg(); 
			}
		}
		if(psn != null)
			view.printObj(psn);
	}
	@Override
	public void edit() {
		boolean result = dao.edit(view.inputEditInfo(), 
				StudentMainView.infoArr);
		view.printMsg(result?"수정완료":"수정실패");
	}
	@Override
	public void delete() {
		boolean result = dao.delete(view.deleteMetaInfo());
		view.printMsg(result?"삭제완료":"삭제실패");
	}
}
