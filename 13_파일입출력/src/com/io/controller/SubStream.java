package com.io.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

import com.io.model.vo.Animal;

public class SubStream {
	public void changeStream() {
		// 바이트 기반 스트림을 문자열 기반 스트림으로 변환해주는 보조 스트림
		// InputStreamReader / OutputStreamWriter
		try (FileInputStream fis = new FileInputStream("animals.bs");
				InputStreamReader isr = new InputStreamReader(fis);) {
			int data = 0;
			while((data = isr.read()) != -1) { //read()가 byte-fis-/char-isr-로 끊어서 읽어옴
				System.out.println((char)data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// network 통신으로 데이터를 가져올때 byte 기반으로 스트림 처리(통신)
		InputStream input = null;
		InputStreamReader isr = null;
		try {
			URL url = new URL("https://google.com");
			HttpURLConnection connect = (HttpURLConnection)url.openConnection();
			input = connect.getInputStream(); //HttpURLConnection의 getInputStream은 InputStream을 반환
			isr = new InputStreamReader(input);
			int data = 0;
			StringBuffer sb = new StringBuffer();
			while((data=isr.read()) != -1) {
				sb.append((char)data);
			}
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void bufferedSave() {
		try(FileOutputStream fos = new FileOutputStream("testfile");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
//				OutputStreamWriter osw = new OutputStreamWriter(bos);
				) {
			String msg = "오늘은 금요일 아이유 만나는 날!";
			bos.write(msg.getBytes());
//			osw.write(msg);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void bufferedLoad() {
		try(FileInputStream fis = new FileInputStream("testfile");
				BufferedInputStream bis = new BufferedInputStream(fis);
				InputStreamReader isr = new InputStreamReader(bis)) {
			int data = 0;
			while((data = isr.read()) != -1) {
				System.out.println((char)data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// 데이터 타입별로 저장하는 stream
	// DataInputStream/DataOutputStream
	public void saveDataStream() {
		try(FileOutputStream fos = new FileOutputStream("aniData.bs");
				DataOutputStream dos = new DataOutputStream(fos);) {
			// dataoutputstream은 자료형별 저장 메소드를 제공
//			Animal a = new Animal("도토리", 3, 0.3);
			Animal[] animals = {
			new Animal("오순", 2, 15),
			new Animal("도순", 1, 17),
			new Animal("보리", 6, 6),
			new Animal("도토리", 3, 0.3)
			};
			for(Animal a : animals) {
				dos.writeUTF(a.getName()); //문자열
				dos.writeInt(a.getAge()); //정수
				dos.writeDouble(a.getWeight()); //실수
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void loadDataStream() {
		try(FileInputStream fis = new FileInputStream("aniData.bs");
				DataInputStream dis = new DataInputStream(fis);) {
			//parseInt, parseDouble 등을 생략하게 해주는 코드
			while(true) {
				try {
					String name = dis.readUTF(); 
					int age = dis.readInt();
					double weight = dis.readDouble();
					Animal a = new Animal(name, age, weight);
					System.out.println(a);
				} catch(EOFException e) {
					System.out.println("파일 다 읽어써!!");
					break;
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
//	public void saveDataStream2() {
//		try(FileOutputStream fos = new FileOutputStream("aniData.bs");
//				DataOutputStream dos = new DataOutputStream(fos);) {
//			Animal[] animals = {
//			new Animal("오순", 2, 15),
//			new Animal("도순", 1, 17),
//			new Animal("보리", 6, 6),
//			new Animal("도토리", 3, 0.3)
//			};
//			for(Animal a : animals) {
//				dos.writeUTF(a.getName()); //문자열
//				dos.writeInt(a.getAge()); //정수
//				dos.writeDouble(a.getWeight()); //실수
//			}
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void loadDataStream2() {
//		try(FileInputStream fis = new FileInputStream("aniData.bs");
//				DataInputStream dis = new DataInputStream(fis);) {
//			while(true) {
//				try {
//					String name = dis.readUTF(); 
//					System.out.println(name);
//					System.out.println(dis.readUTF());
//					System.out.println(dis.readUTF());
//				} catch(EOFException e) {
//					System.out.println("파일 다 읽어써!!");
//					break;
//				}
//			}
//		} catch(IOException e) {
//			e.printStackTrace();
//		}	
//	}
	
	// 객체를 파일에 저장해주는 stream
	// ObjectOutputStream/ObjectInputStream
	public void saveAnimal() {
		try(FileOutputStream fos = new FileOutputStream("objData.bs");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(new Animal("샴", 11, 7));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadAnimal() {
		try(ObjectInputStream ois = 
				new ObjectInputStream(
				new FileInputStream("objData.bs"));) {
			Animal a = (Animal)ois.readObject();
			System.out.println(a);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveAnimals(Animal[] animals) {
		try(ObjectOutputStream oos =
				new ObjectOutputStream(
				new FileOutputStream("animalsObj.bs"));) {
//			for(Animal a : animals) {
//				oos.writeObject(a);
//			}
			oos.writeObject(animals);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public Animal[] loadAnimals() {
		Animal[] result = null;
		int count = 0;
		try(ObjectInputStream ois =
				new ObjectInputStream(
				new FileInputStream("animalsObj.bs"));) { //ObjectInputStream에서는 append가 안됨.
//			result = (Animal[])ois.readObject();
			while(true) {
				try {
					count++;
					ois.readObject(); 
				} catch(EOFException e) {
					e.printStackTrace();
					result = new Animal[count++];
					count = 0;
					while(true) {
						try {
							result[count++] = (Animal) ois.readObject();
						} catch(ClassNotFoundException er) {
							er.printStackTrace();
						} catch(EOFException er) {
							er.printStackTrace();
						}
					}
				} catch(ClassNotFoundException er) {
					break;
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}