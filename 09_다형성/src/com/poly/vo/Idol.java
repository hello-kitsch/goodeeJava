package com.poly.vo;

public class Idol extends Person {
//	private String name;
//	private int age;
	private String team;
	private int memberCount;
	
	public Idol() {
		// TODO Auto-generated constructor stub
	}
	public Idol(String name, int age, String team, int memberCount) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.team = team;
		this.memberCount = memberCount;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}
	
	public String infoIdol() {
		return super.infoPerson() + this.team + this.memberCount;
	}
	
	@Override
	public String infoPerson() {
		return infoIdol();
	}
	
	@Override
	public String toString() {
		return infoIdol();
	}
	
	@Override
	public String info() {
		return toString();
	}
}
