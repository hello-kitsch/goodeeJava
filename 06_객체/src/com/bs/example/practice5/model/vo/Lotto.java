package com.bs.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	private int[] lotto;
	
	{
		lotto = new int[6];
		Random rnd = new Random();
		for(int i=0; i<6; i++)
			lotto[i] = rnd.nextInt(45) + 1;
	}
	
	public Lotto() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

	public void information() {
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i] + " ");
	}
}
