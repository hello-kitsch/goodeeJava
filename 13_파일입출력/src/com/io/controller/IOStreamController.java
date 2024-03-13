package com.io.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.io.model.vo.Animal;

public class IOStreamController {
	public void fileSave() {
		//변수에 저장되어있는 데이터를 HDD의 지정된 file로 옮기는 것
		//OutputStream 클래스를 상속받은 클래스를 이용
		//  FileOutputStream 클래스를 이용
		//   매개변수 있는 생성자를 이용해서 생성
		//   File 객체, String 두 가지가 가능함.
		//   new FileOutputStream(new File([경로+]"파일명"));
		//   new FileOutputStream([경로+]"파일명");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("test2"));
			//사용할 스트림 객체를 생성했으면 스트림 객체가 제공하는
			//메소드를 이용해서 원하는 데이터를 저장시킴
			//write(int형); -> byte 기반 통신
			//write(byte[]);
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
			//byte 기반 통신
//			fos.write("유병승");
			String name = "유병승";
			fos.write(name.charAt(0));
			fos.write(name.charAt(1));
			fos.write(name.charAt(2));
			
			name = "banana";
			for(int i=0; i<name.length(); i++)
				fos.write(name.charAt(i));
			
			//저장 후에는 반드시 스트림 객체를 반환해줘야한다.
			//close() 메소드를 이용
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null)
					fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileOpen() {
		//파일에 저장된 데이터를 불러오기
		//InputStream 클래스를 이용
		//  FileInputStream 클래스를 생성해서 이용
		//   매개변수 있는 생성자를 이용해서 생성
		//   File클래스, String 을 매개변수로 대입
		//   new FileInputStream(new File());
		//   new FileInputStream("");
		//   사용 후에는 반드시 반환해줘야함. close() 메소드를 호출
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test33");
			//데이터를 가져올때는 read() 메소드를 호출
			//int형으로 데이터를 가져옴
			//반환값이 -1이 되는 순간 파일 내용을 다 가져온 것임.
			int data = 0;
			while((data = fis.read()) != -1) {
				System.out.println((char)data);
			}
			System.out.println("파일 내용을 모두 읽어옴!");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null)
					fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//문자열 기반 Stream 이용하기
	public void writeFile() {
		//문자열을 파일에 저장할 때 사용
		//Writer 클래스 이용(추상클래스)
		// FileWriter 클래스를 생성해서 이용
		// 매개변수 있는 생성자를 이용해서 생성
		FileWriter writer = null;
		try {
			writer = new FileWriter("strdata.bs");
			//write() 메소드를 이용해서 데이터를 저장
			writer.write("유병승");
			writer.write("점심 먹고 졸릴 시간이에요 졸면 안돼요");
			writer.write(19);
			
			String name = "졸지마";
			for(int i=0; i<name.length(); i++) {
				writer.write(name.charAt(i));
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null)
					writer.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void readFile() {
		try(FileReader fr = new FileReader("strdata.bs");) {
			int data = 0;
			StringBuffer sb = new StringBuffer();
			while((data = fr.read()) != -1) {
				sb.append((char)data);
			}
			System.out.println(sb);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//파일에 데이터를 저장하는 메소드, 파일에 저장된 데이터를 불러오는 메소드 구현
	//1. 파일명, 저장할 데이터(문자열)를 전달받아 저장하는 기능
	//2. 파일명을 전달받아 그 파일에 내용을 출력해주는 기능
	public void writeCustomFile(String fileName, String data) {
		try (FileWriter fw = new FileWriter(fileName, true);){
//			for(int i=0; i<data.length(); i++) {
//				fw.write(data.charAt(i));
//			}
			fw.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readCustomFile(String fileName) {
		try (FileReader fr = new FileReader(fileName);){
			int data = 0;
			StringBuffer sb = new StringBuffer();
			while((data = fr.read()) != -1) {
				sb.append((char)data);
			}
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveAnimal(Animal[] animals) {
		try(FileWriter fw = new FileWriter("animals.bs");) {
			for(Animal a: animals) {
//				String strA = a.getName()+","+a.getAge()+","+a.getWeight()+"\n";
				String strA = a+"\n"; //참조형 변수에는 toString()의 리턴값이 담겨온다
				fw.write(strA);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public Animal[] loadAnimal() {
		Animal[] animals = null;
		try (FileReader fr = new FileReader("animals.bs");) {
			//1. String을 읽어와서 저장
			StringBuffer sb = new StringBuffer();
			int data = 0;
			while((data=fr.read())!= -1) {
				sb.append((char)data);
			}
			//2. String을 개행문자를 기준으로 파싱하기 (텍스트 -> String)
			String[] strArrAnimals = new String(sb).split("\n");
			
			//3. String을 ,문자를 기준으로 파싱하여 Animal 객체에 생성해 넣기 (String -> animal)
			animals = new Animal[strArrAnimals.length];
			int count = 0;
			for(String a : strArrAnimals) {
				String[] animal = a.split(",");
				animals[count++] = new Animal(animal[0],
						Integer.parseInt(animal[1]),
						Double.parseDouble(animal[2]));
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		return animals;
	}
}
