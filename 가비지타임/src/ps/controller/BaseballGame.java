package ps.controller;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {
	public void baseBallGame1() {
        int[] arrAnswer = new int[3];
        for(int i=0; i<3; i++) {
            arrAnswer[i] = (int) (Math.random()*10);
        }
        System.out.println("답: " + Arrays.toString(arrAnswer));
        Scanner sc = new Scanner(System.in);
        
        t:
        while(true) {
            int strike = 0;
            int ball = 0;
            int[] arrUser = new int[3];
            
            for(int i=0; i<3; i++) {
                System.out.println(i+1 + " 자리 정수 입력: ");
                arrUser[i] = (int)sc.next().charAt(0) - 48;
            }
            for(int i=0; i<arrAnswer.length; i++) {
                for(int j=0; j<arrUser.length; j++) {
                    int[] ballArr = new int[3];
                    if(arrAnswer[i] == arrUser[j]) {
                        if(i==j) {
                            for(int v: ballArr) {
                                if(v == arrAnswer[i]) {
                                    ball--;
                                }
                            }
                            strike++;
                        } else {
                            ball++;
                            int count1 = 0, count2 = 0;
                            for(int v: ballArr) {
                                if(v == arrUser[j]) {
                                    ball--;
                                    count2++;
                                }
                            }
                            if(count2 == 0) {
                                ballArr[count1++] = arrUser[j];
                            }
                        }
                    }
                }
            }
            if(strike == 3) {
                System.out.println(strike + "스트라이크 정답");
                while(true){
                    System.out.println("게임 한판 더?(Y/N)");
                    char choice = sc.next().charAt(0);
                    if(choice == 'n' || choice == 'N') {
                        break t;
                    } else if(choice == 'y' || choice =='Y' ) {
                        continue t;
                    } else {
                        System.out.println("잘못된 선택지 입력!");
                    }
                }
            } else {
                if(strike > 0) {
                    System.out.print(strike + "스트라이크 ");
                }
                if(ball > 0) {
                    System.out.print(ball + "볼");
                }
                if(strike == 0 && ball == 0) {
                    System.out.print("파울");
                }
                System.out.println();
            }    
        }
	}
}
