package com.student.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.student.model.vo.Person;
import com.student.model.vo.Student;

public class StudentDao implements Dao {
	private Person[] p = new Person[SIZE];
	public static final int AGE_LIMIT = 20;
	private int count = 0;

	@Override
	public void saveDao() {
		try(ObjectOutputStream oos =
				new ObjectOutputStream(
				new FileOutputStream("student.dat"));) {
			oos.writeObject(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void loadDao() {
		Person[] result = null;
		try(ObjectInputStream ois = 
				new ObjectInputStream(
				new FileInputStream("student.dat"));) {
			result = (Person[])ois.readObject();
			if(result == null)
				result = new Person[SIZE];
		} catch(FileNotFoundException e) {
			result = new Person[SIZE];
//		} catch(EOFException e) {
//			result = new Person[SIZE];
		} catch(ClassNotFoundException e) {
			result = new Person[SIZE];
			e.printStackTrace();
		} catch(IOException e) {
			result = new Person[SIZE];
			e.printStackTrace();
		}
		p = result;
	}
	
	@Override
	public boolean enroll(Person p) {
		for(int i=0; i<=this.p.length; i++) {
			try {
				Student s1 = (Student)this.p[i];
				if(s1 == null) {
					for(int j=0; j<i; j++) {
						Student s2 = (Student)this.p[j];
						if(s2 != null && s2.equals(p)) {
							return false;
						}
					}
					this.p[i] = (Student)p;
					return true;
				}
			} catch(ArrayIndexOutOfBoundsException e) {
				Person[] np = new Student[this.p.length + SIZE*(++count)];
				System.arraycopy(this.p, 0, np, 0, this.p.length);
				this.p = np;
			}
		}
		return false;
	}
	
	@Override
	public String showAll() {
		String str = "";
		for(Person s : p) {
			if((Student)s != null)
				str += ((Student)s).toString() + "\n";
		}
		return str;
	}
	
	@Override
	public boolean edit(Person p, int[] arr) {
		for(Person s : this.p) {
			Student ss = (Student)s;
			int count = 0;
			if(ss != null && ss.getNumber() == ((Student)p).getNumber()) {
				if(arr[0] == 1) //이름
					ss.setName(p.getName()); count++;
				if(arr[1] == 1) //나이
					ss.setAge(p.getAge()); count++;
				if(arr[2] == 1) //성별
					ss.setGender(p.getGender()); count++;
				if(arr[3] == 1) //키
					ss.setHeight(p.getHeight()); count++;
				if(arr[4] == 1) //주소
					ss.setAddress(p.getAddress()); count++;
				if(arr[5] == 1) //전화번호
					ss.setPhone(p.getPhone()); count++;
				if(arr[6] == 1) //학년
					ss.setGrade(((Student)p).getGrade()); count++;
				if(arr[7] == 1) //반
					ss.setClassNumber(((Student)p).getClassNumber());count++;
				if(count > 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public boolean delete(int num) {
		for(int i=0; i<p.length; i++) {
			if(p[i] != null && p[i].getNumber() == num) {
				p[i] = null;
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Person[] search(Person[] p, SearchCheck filter, Object data) {
		Person[] pp = new Student[this.p.length];
		int count = 0;
		for(Person ppp : p) {
			if(filter.check(ppp, data)) {
				pp[count++] = ppp;
			}
		}
		return pp;
	}
	
	//번호 이름 학년 주소 성별 나이
	@Override
	public Person[] searchHow(int num, Object obj) {
		switch(num) {
			case 1: 
				return search(p, (pp, data) -> (pp != null) ? 
						(((Student)pp).getNumber() == (int)data) : false, (Integer)obj);
			case 2: //부분검색
				return search(p, (pp, data) -> (pp != null) ? 
						(((Student)pp).getName().contains((String)data)) : false, (String)obj);
			case 3:
				return search(p, (pp, data) -> (pp != null) ? 
						(((Student)pp).getGrade() == (int)data) : false, (Integer)obj);
			case 4: //부분검색
				return search(p, (pp, data) -> (pp != null) ? 
						(((Student)pp).getAddress().contains((String)data)) : false, (String)obj);
			case 5:
				return search(p, (pp, data) -> (pp != null) ? 
						(((Student)pp).getGender() == ((String)data).charAt(0)) : false, (String)obj);
			case 6:
				return search(p, (pp, data) -> (pp != null) ? (((Student)pp).getAge() >= ((int[])data)[0] && ((Student)pp).getAge() <= ((int[])data)[1]) : false, (int[])obj);
		}
		return search(p, (pp, data) -> false, obj);
	}
}
