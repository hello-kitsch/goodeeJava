package ps.controller;

import java.util.Scanner;

public class UpAndDown {
    //up&down게임 만들기
   	//랜덤으로 1~50까지 수 한개를 저장하고
	   //사용자가 입력하는 값과 비교해서 크면 up, 작으면 다운 출력
    //맞출때까지 반복 맞추면 정답, 00회만에 맞췄습니다 출력
    public void updown() {
        int rnd = (int)(Math.random()*50) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(true) {
            System.out.print("정수 입력: ");
            int num = sc.nextInt();
            if(num == rnd) {
                System.out.println("정답, " + count + "회만에 맞췄습니다.");
                break;
            }
            if(num > rnd) System.out.println("down");
            if(num < rnd) System.out.println("up");
        }
    }
}
