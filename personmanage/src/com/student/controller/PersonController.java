package com.student.controller;

import com.student.model.dao.Dao;
import com.student.view.MainView;
import com.student.view.StudentMainView;

public abstract class PersonController {
	protected MainView view;
	protected Dao dao;
	
	public PersonController(MainView view, Dao dao) {
		this.view = view;
		this.dao = dao;
	}
	
	public void mainView() {
		this.dao.loadDao();
		int num = 1;
		while(num != 0) {
			num = view.mainMenu();
			switch(num) {
				case 1: enroll(); break;
				case 2: showAll(); break;
				case 3: search(); break;
				case 4: edit(); break;
				case 5: delete(); break;
				case 0: dao.saveDao(); return;
				default: view.printErrMsg();
			}
		}
		if(num == 0)
			view.printEndMsg();
	}
	public void enroll() {
		boolean result = dao.enroll(view.inputNewInfo());
		view.printMsg(result?"등록성공":"등록실패");
	}
	public void showAll() {
		view.printMsg(dao.showAll());
	}
	public void edit() {
		showAll();
		boolean result = dao.edit(view.inputEditInfo(), 
				StudentMainView.infoArr);
		view.printMsg(result?"수정완료":"수정실패");
	}
	public void delete() {
		boolean result = dao.delete(view.deleteMetaInfo());
		view.printMsg(result?"삭제완료":"삭제실패");
	}
	public abstract void search();
}
