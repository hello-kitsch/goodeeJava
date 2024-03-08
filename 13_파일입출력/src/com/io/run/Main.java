package com.io.run;

import java.util.Scanner;

import com.io.controller.IOStreamController;
import com.io.model.vo.Animal;

public class Main {
	public static void main(String[] args) {
//		new IoController().fileControlTest();
//		new IoController().fileInfoTest();
		Scanner sc = new Scanner(System.in);
//		System.out.println("파일 저장 경로: ");
//		String path = sc.nextLine();
//		System.out.println("파일명: ");
//		String fileName = sc.nextLine();
//		System.out.println(new IOController().newfile(path, fileName));
		
//		new IOStreamController().fileSave(); //파일이 없으면 만들어서 가져옴
//		new IOStreamController().fileOpen(); //파일이 없으면 에러 발생
//		new IOStreamController().writeFile();
//		new IOStreamController().readFile();
		
//		System.out.println("파일이름:");
//		String fileName = sc.nextLine();
//		System.out.println("데이터:");
//		String data = sc.nextLine();
//		new IOStreamController().writeCustomFile(fileName, data);
//		new IOStreamController().readCustomFile(fileName);		
		
		Animal[] animals = {
				new Animal("오순", 2, 15),
				new Animal("도순", 1, 17),
				new Animal("보리", 6, 6),
				new Animal("도토리", 3, 0.3)
		};
		new IOStreamController().saveAnimal(animals);
		Animal[] saveAnimals = new IOStreamController().loadAnimal();
		for(Animal a : saveAnimals) {
			System.out.println(a);
		}
	}
}
