package com.bs.example.practice6.run;

import com.bs.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book("데미안","창비","헤세");
		Book b2 = new Book("이방인","문학동네","카뮈",14000,0.1);
		b1.inform();
		b2.inform();
	}
}
