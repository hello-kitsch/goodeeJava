package ps.controller;

import java.util.Scanner;
import java.util.Random;

public class RspGame {
    public void rspGame() {
        Scanner sc = new Scanner(System.in);
        int comWin = 0, userWin = 0, same = 0;
        boolean ctn = true;
        do {
            System.out.print("1. 가위\n2. 바위\n3. 보\n중에 선택: ");
            int user = sc.nextInt();
            if(user < 1 || user > 3) {
                System.out.println("올바른 선택지를 입력하세요");
                continue;
            }
            int com = (int)(Math.random()*3) +1;
            System.out.println("컴퓨터: " + com);
            if (com == user) {
                System.out.println("비겼습니다.");
                same++;
                continue;
            } else if(com==1) {
                switch(user) {
                    case 2: System.out.println("사용자가 이겼습니다."); userWin++; break;
                    case 3: System.out.println("컴퓨터가 이겼습니다."); comWin++; break;
                }
            } else if(com==2) {
                switch(user) {
                case 1: System.out.println("컴퓨터가 이겼습니다."); comWin++; break;
                case 3: System.out.println("사용자가 이겼습니다."); userWin++; break;
                }
            } else if(com==3) {
                switch(user) {
                case 1: System.out.println("사용자가 이겼습니다."); userWin++; break;
                case 2: System.out.println("컴퓨터가 이겼습니다."); comWin++; break;
                }
            }
            while(true) { 
                System.out.print("다시 하시겠습니까? (Y/N)");
                char ch = sc.next().charAt(0);
                if(ch == 'Y' || ch == 'y') {
                    ctn = true;
                    break;
                } else if(ch == 'N' || ch == 'n') {
                    System.out.println("가위바위보 프로그램을 종료합니다.");
                    ctn = false;
                    break;
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }
        } while (ctn);
        System.out.println("컴퓨터 승 " + comWin + "번, 사용자 승 " + userWin + "번, 비김 " + same + "번");
    }

    public void rspGame2() {
        int rsp = 0; //rsp=사용자가 낸 값
        int result = 0; //
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int win =0, comWin =0;
        int num1 = 0;
        int num2 = 0;
        int com = rd.nextInt(3)+1;
        System.out.println(com);
        while(true){
            
            System.out.println("1. 가위 2. 바위 3. 보");
            rsp = sc.nextInt(); 

            if((com>rsp)&&(com==3)) com%=3; //rsp가 1,2번일 때 com이 3이면 com을 0으로 바꾼다.
            //com = 1, 2, 0
            //rsp = 1, 2, 3
            result = (com-rsp)%3; 
            //result = 0, -1, -2 (비김, 이김, 짐)
            //result = 1, 0, -1 (짐, 비김, 이김)
            //result = -1, -2 0 (이김, 짐, 비김)

            if(rsp==com){System.out.println("비겼습니다");
            }else if(result == -1){
                System.out.println("이겼습니다");
                win++;
            }else if(result == -2||result == 1){
                System.out.println("졌습니다");
                comWin++;
            }
            
            System.out.println("다시하겠습니다 : 1.예 / 2.아니오");
            num1 = sc.nextInt();
            if(num1==1){
                continue;
            }
            if(num1==2){
                System.out.printf("컴퓨터 승 %d번 사용자 승 %d번",comWin,win);
                break;
            }
        }
    }
}
