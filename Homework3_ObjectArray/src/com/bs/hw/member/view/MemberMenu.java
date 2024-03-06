package com.bs.hw.member.view;

import java.util.Scanner;
import com.bs.hw.member.controller.MemberController;
import com.bs.hw.member.model.vo.Member;

import static com.bs.hw.member.controller.MemberController.getMc;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = getMc();
	
//	싱글톤패턴
//	private static MemberMenu menu;
//	private MemberMenu() {}
//	public static MemberMenu getMenu() {
//		if(MemberMenu.menu == null)
//			MemberMenu.menu = new MemberMenu();
//		return MemberMemu.menu;
//	}
	public MemberMenu() {
	}
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("최대 등록 가능한 회원 수는 "+mc.SIZE+"명입니다.");
			System.out.println("현재 등록된 회원 수는 "+mc.existMemberNum()+"명입니다.");
			
			if(mc.existMemberNum() < 10) {
				System.out.println("==== 회원 관리 프로그램 ====");
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");			
				System.out.print("메뉴를 고르세요: ");
				int menu = sc.nextInt();
				sc.nextLine();
				
				switch(menu) {
					case 1: insertMember(); break;
					case 2: searchMember(); break;
					case 3: updateMember(); break;
					case 4: deleteMember(); break;
					case 5: printAll(); break;
					case 9: System.out.println("프로그램을 종료합니다."); return;
					default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
				}
			} else if(mc.existMemberNum() == 10) {
				System.out.println("==== 회원 관리 프로그램 ====");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");			
				System.out.print("메뉴를 고르세요: ");
				int menu = sc.nextInt();
				sc.nextLine();
				
				switch(menu) {
					case 2: searchMember(); break;
					case 3: updateMember(); break;
					case 4: deleteMember(); break;
					case 5: printAll(); break;
					case 9: System.out.println("프로그램을 종료합니다."); return;
					default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
				}
			}
		}
	}
	
	public void insertMember() {
		String str = "";
		while(true) {
			System.out.println("아이디 입력: ");
			str = sc.nextLine();
			if(mc.checkId(str)) 
				break;
			else 
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		System.out.println("비밀번호 입력: ");
		String password = sc.nextLine();
		System.out.println("이메일 입력: ");
		String email = sc.nextLine();
		char gender = ' ';
		while(true) {
			System.out.println("성별 입력: ");
			gender = sc.next().charAt(0);
			if(gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') 
				break;
			else 
				System.out.println("성별을 다시 입력하세요.");
		}
		System.out.println("나이 입력: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		mc.insertMember(str, name, password, email, gender, age);
	}
	
	public void searchMember() {
		while(true) {
			System.out.println("==== 멤버 검색 ====");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("메뉴 번호 입력: ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
				case 1: searchId(); return;
				case 2: searchName(); return;
				case 3: searchEmail(); return;
				case 9: System.out.println("메인으로 돌아갑니다."); return;
				default: System.out.println("잘못 입력하셨습니다."); return;
			}
		}
	}
	
	public void searchId() {
		System.out.print("검색할 아이디를 입력: ");
		String id = sc.nextLine();
		String str = mc.searchId(id);
		if(str == null) {
			System.out.println("검색 결과가 없습니다");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(str);
		}
	}
	
	public void searchName() {
		System.out.print("검색할 이름을 입력: ");
		String name = sc.nextLine();
		Member[] m = mc.searchName(name);
		int count = 0;
		for(Member mm : m) {
			if(mm != null)
				count ++;
		}
		if(count == 0) {
			System.out.println("검색 결과가 없습니다");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(int i=0; i<count; i++) {
				System.out.println(m[i]);
			}
		}
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일을 입력: ");
		String email = sc.nextLine();
		Member[] m = mc.searchEmail(email);
		int count = 0;
		for(Member mm : m) {
			if(mm != null)
				count ++;
		}
		if(count == 0) {
			System.out.println("검색 결과가 없습니다");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(int i=0; i<count; i++) {
				System.out.println(m[i]);
			}
		}
	}
	
	public void updateMember() {
		while(true) {
			System.out.println("==== 멤버 업데이트 ====");
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("메뉴 번호 입력: ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
				case 1: updatePassword(); return;
				case 2: updateName(); return;
				case 3: updateEmail(); return;
				case 9: System.out.println("메인으로 돌아갑니다."); return;
				default: System.out.println("잘못 입력하셨습니다."); return;
			}
		}
	}
	
	public void updatePassword() {
		System.out.print("수정할 회원 아이디를 입력: ");
		String id = sc.nextLine();
		System.out.print("수정할 비밀번호를 입력: ");
		String password = sc.nextLine();
		boolean bool = mc.updatePassword(id, password);
		if(!bool) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
	}
	
	public void updateName() {
		System.out.print("수정할 회원 아이디를 입력: ");
		String id = sc.nextLine();
		System.out.print("수정할 이름를 입력: ");
		String name = sc.nextLine();
		boolean bool = mc.updateName(id, name);
		if(!bool) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원 아이디를 입력: ");
		String id = sc.nextLine();
		System.out.print("수정할 이메일를 입력: ");
		String email = sc.nextLine();
		boolean bool = mc.updateEmail(id, email);
		if(!bool) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
	}
	
	public void deleteMember() {
		while(true) {
			System.out.println("==== 멤버 삭제 ====");
			System.out.println("1. 특정 회원 삭제하기");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("메뉴 번호 입력: ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
				case 1: deleteOne(); return;
				case 2: deleteAll(); return;
				case 9: System.out.println("메인으로 돌아갑니다."); return;
				default: System.out.println("잘못 입력하셨습니다."); return;
			}
		}
	}
	
	public void deleteOne() {
		System.out.print("삭제할 회원 아이디를 입력: ");
		String id = sc.nextLine();
		System.out.print("정말 삭제할 것인가요?(Y/y): ");
		char ch = sc.next().charAt(0);
		if(ch == 'y' || ch == 'Y') {
			boolean bool = mc.delete(id);
			if(!bool) {
				System.out.println("존재하지 않는 아이디입니다.");
			} else {
				System.out.println("성공적으로 삭제하였습니다.");
			}
		}
	}
	
	public void deleteAll() {
		System.out.print("정말 삭제할 것인가요?(Y/y): ");
		char ch = sc.next().charAt(0);
		if(ch == 'y' || ch == 'Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
	}
	
	public void printAll() {
		Member[] m = mc.printAll();
		int count = 0;
		for(Member mm : m) {
			if(mm != null) 
				count++;
		}
		if(count == 0) 
			System.out.println("저장된 회원이 없습니다.");
		else {
			for(int i=0; i<count; i++) {
				System.out.println(m[i].inform());
			}
		}
	}
}
