package com.student.controller;

import com.student.model.dao.StudentDao;
import com.student.model.dao.StudentDao_;
import com.student.model.vo.Student;
import com.student.view.MainView;
import static com.student.view.MainView.getView;

public class StudentController {
	private final StudentDao sda = new StudentDao();
//	private final MainView view = new MainView(); //무한루프
	
	//싱글톤패턴
	private static StudentController controller;
	private StudentController() {}
	public static StudentController getController() {
		if(StudentController.controller == null)
			StudentController.controller = new StudentController();
		return StudentController.controller;
	}
	
	//메인화면을 출력해주는 기능
	public void mainView() {
		getView().mainMenu();
	}
	//학생등록기능 구현
	public void enrollStudent() {
		//클라이언트가 학생 정보를 입력할 수 있는 화면을 출력
		Student s = getView().inputStudentView();
//		System.out.println(s.infoStudent());
		boolean result = sda.insertStudent(s);
		getView().printMsg(result? "학생 등록 성공" : "학생 등록 실패");
	}
	//학생 전체조회 기능 구현
	public void checkAllStudent() {
		String result = sda.searchStudent();
		getView().printStudent(result);
	}
	
	//학생 이름으로 조회하는 기능 구현
	public void searchStudentForName() {
		String name = getView().inputString();
		String result = sda.searchStudentName(name);
		getView().printStudent(result);
	}
	
	//학년으로 조회
	public void searchStudentForGrade() {
		int grade = getView().inputInt();
		String result = sda.searchStudentGrade(grade);
		getView().printStudent(result);
	}
	
	//학생 번호로 수정하는 기능 구현
	public void editStudentInfo() {
		checkAllStudent();
		int num = getView().inputInt();
		Student std = getView().inputNewStudentInfo();
		boolean result = sda.editStudent(num, std);
		getView().printMsg(result ? "수정성공" : "수정실패");
	}
	
	//학생 번호로 삭제하는 기능 구현
	public void deleteStudentInfo() {
		checkAllStudent();
		int num = getView().inputInt();
		boolean result = sda.deleteStudent(num);
		getView().printMsg(result ? "삭제성공" : "삭제실패");
		
	}
}