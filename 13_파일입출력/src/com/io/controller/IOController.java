package com.io.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class IOController {
	public void fileControlTest() {
		//java 코드로 file 관리하기
		//File 클래스를 이용해서 HDD/SSD에 저장된 파일의 정보를 가져오거나
		//HDD/SSD에 파일 및 폴더를 생성할 수 있다.
		
		//1. File 클래스 생성하기
		//매개변수 있는 생성자를 이용해서 생성
		//매개변수: [파일 경로+] 파일명
		//default 경로 -> 프로젝트경로 기본경로
		File f = new File("test.txt");
		
		//filesystem -> 계층구조
		//절대경로: root부터 시작
		// c:\\Users\\GD
		//상대경로: 
		// ./ 현재폴더
		// ../한개 상위 폴더
		// ../../두개 상위 폴더
//		File f = new File("C:/Users/jyluc/test.txt");
		//User/사용자계정명/test.txt
//		File f = new File("../../test.txt");
		
		
		//File 클래스가 제공하는 메소드를 이용해서
		//매개변수 파일을 생성, 삭제 등을 할 수 있다.
		//이미 있는 파일이면 파일에 대한 정보를 가져올 수 있다.
		//파일 생성하기
		//createNewFile() 메소드를 이용
		try {
			boolean result = f.createNewFile();
			System.out.println(result?"파일생성":"생성실패");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		//2. 폴더 만들기
		// mkdir(): 폴더 한개를 생성할때 사용
		// mkdirs(): 폴더 여러 개를 생성할때 사용
		// ./test/test1/test2/test.txt
		
//		File dir = new File("./test");
//		dir.mkdir();
		
		File dir = new File("./test/test1/test2");
		dir.mkdirs();
		
		File f2 = new File("./test/test1/test2/myfile");
		try {
			boolean result = f2.createNewFile();
			System.out.println(result);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		//3. 파일 삭제하기
		//delete()를 이용해서 파일을 삭제
		File delFile = new File("./test/test1/test2/myfile");
		boolean result = delFile.delete();
		System.out.println(result);
		
		//4. 폴더 삭제하기
		//폴더 내에 아무것도 없어야한다.
		File delDir = new File("./test/test1/test2");
		result = delDir.delete();
		System.out.println(result);
	}
	
	public void fileInfoTest() {
		//파일 정보 확인하기
		File f = new File("./test.txt");
		//파일명 확인
		System.out.println("파일명: " + f.getName());
		//파일의 부모 파일 확인하기
		System.out.println("부모 파일: " + f.getParent());
		//부모를 File클래스로 가져오기
		File parent = f.getParentFile();
		System.out.println(parent.getName());
		System.out.println(parent.isDirectory());
		
		//파일의 경로 출력하기
		System.out.println("파일경로: " + f.getPath());
		System.out.println("절대경로: " + f.getAbsolutePath());
		System.out.println(f.getAbsolutePath()
				.substring(0, f.getAbsolutePath().indexOf(".\\")));
		
		//파일인지, 폴더인지 확인하는 메소드
		//isDirectory()
		//ifFile()
		System.out.println("파일? " + f.isFile());
		System.out.println("파일? " + f.isDirectory());
		System.out.println("부모는 폴더? " + parent.isFile());
		System.out.println("부모는 파일? " + parent.isDirectory());
		
		//파일크기, 읽기, 쓰기, 숨김, 수정 날짜 실행 가능
		System.out.println("파일 크기: " + f.length());
		System.out.println("숨김 여부: " + f.isHidden());
		System.out.println("읽기 가능?: " + f.canRead());
		System.out.println("쓰기 가능?: " + f.canWrite());
		System.out.println("실행 가능?: " + f.canExecute());
		System.out.println("수정 날짜: " + new Date(f.lastModified()));
		System.out.println("파일/폴더가 있는지: " + new File("tt").exists());
	
		//filesystem에 저장된 파일을 가져오는 메소드
		// list() / listFiles()
		File targetDir = new File("c:\\Windows\\System32");
		String[] fileNames = targetDir.list();
		for(String file: fileNames) {
			System.out.println(file);
		}
		File[] files = targetDir.listFiles();
		for(File file : files) {
			if(file.isFile())
				System.out.println(file.getName() + " " + 
							(file.isFile()?"파일":"폴더"));
		}
		
//		files = targetDir.listFiles(new FileFilter() {
//			@Override
//			public boolean accept(File f) {
//				return f.isFile();
//			}
//		});
		
		files = targetDir.listFiles(fi-> fi.isFile());
		Arrays.stream(files).forEach(System.out::println);
//		Arrays.stream(files).forEach(f1->System.out.println(f1));
		for(File f1 : files)
			System.out.println(f1);
	}
	
	//내가 원하는 폴더에 원하는 파일 생성하는 기능 만들기
	//폴더명, 파일명을 전달받아서 생성
	public boolean newfile(String path, String fileName) {
		path.indexOf(":");
		if(path.startsWith("/")) {
			path = path.replace("/", "");
		}
		File dir = new File(path);
		File f = new File(path + "/" + fileName);
		try {
			if(!dir.exists())
				dir.mkdir();
			return f.createNewFile();
		} catch(IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}