package com.bs.hw.member.controller;

import com.bs.hw.member.model.vo.Member;

public class MemberController {
	public final int SIZE = 10;
	private Member[] m = new Member[SIZE];
	
	//싱글톤 패턴
	private static MemberController mc;
	private MemberController() {}
	public static MemberController getMc() {
		if(MemberController.mc == null)
			MemberController.mc = new MemberController();
		return MemberController.mc;
	}
	
	public int existMemberNum() {
		int count = 0;
		for(Member mb : m) {
			if(mb != null) {
				count++;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
		for(Member mb : m) {
			if(mb != null && mb.getId().equals(inputId))
				return false;
		}
		return true;
	}
	
	public void insertMember(String id, String name, String password,
							String email, char gender, int age) {
		for(int i=0; i<SIZE; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				return;
			}
		}
	}
	
	public String searchId(String id) {
		for(Member mb : m) {
			if(mb != null && mb.getId().equals(id))
				return mb.inform();
		}
		return null;
	}
	
	public Member[] searchName(String name) {
		Member[] m1 = new Member[SIZE];
		for(int i=0, count=0; i<m.length; i++) {
			if(m[i] != null && m[i].getName().equals(name)) {
				m1[count++] = m[i]; 
			}
		}
		return m1;
	}
	
	public Member[] searchEmail(String email) {
		Member[] m1 = new Member[SIZE];
		for(int i=0, count=0; i<m.length; i++) {
			if(m[i] != null && m[i].getEmail().equals(email)) {
				m1[count++] = m[i]; 
			}
		}
		return m1;
	}
	
	public boolean updatePassword(String id, String password) {
		for(Member mm : m) {
			if(mm != null && mm.getId().equals(id)) {
				mm.setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateName(String id, String name) {
		for(Member mm : m) {
			if(mm != null && mm.getId().equals(id)) {
				mm.setName(name);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateEmail(String id, String email) {
		for(Member mm : m) {
			if(mm != null && mm.getId().equals(id)) {
				mm.setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String id) {
		for(int i=0; i<m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public void delete() {
		for(int i=0; i<m.length; i++) {
			m[i] = null;
		}
	}
	
	public Member[] printAll() {
		return m;
	}
}
