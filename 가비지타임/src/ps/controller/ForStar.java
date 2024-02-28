package ps.controller;

public class ForStar {
	//0. 오른쪽 정렬된 삼각형 별찍기
	//  *
	// **
	//***
	//****
	//*****
	public void rightRectangle() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-(i+1); j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
					System.out.print("*");
			}
			System.out.println();	
		}
	}
	
    //1. 시계 방향으로 90도 회전된 피라미드 별찍기
    //*
    //**
    //***
    //****
    //*****
    //****
    //***
    //**
    //*
	public void pyramidBasic() {
		for(int i=0; i<5; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=0; k<4; k++) {
            for(int l=3; l>k; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
	
	public void pyramidOnlyOne() {
		int n = 4;
        for(int i=1; i<=2*n-1; i++) {
            int max = (i <= n) ? i : (2*n-i);
            for(int k=1; k<=max; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
	
    //2. 반시계 방향으로 90도 회전된 피라미드 별찍기 (1-2 응용)
    //   *
    //  **
    // ***
    //****
    // ***
    //  **
    //   *
	public void pyramidRotation() {
        int m = 4;
        for(int i=1; i<=2*m-1; i++) {
            int max = (i<=m) ? i : (2*m-i);
            for(int l=1; l<=m-max; l++) {
                System.out.print(" ");
            }
            for(int k=1; k<=max; k++) { 
                //i=1~4: max=(1~4)
                //i=5~7: max=(3~1)
                System.out.print("*");
            }
            System.out.println();
        }
	}
	
	//3. 피라미드 별찍기
    //  *   i=1 -> 1 / 2
    // ***  i=2 -> 3 / 1 
    //***** i=3 -> 5 / 0
	public void pyramideasy() {
        int row = 3;
        for(int i=1; i<=row; i++) { 
            for(int k=0; k<3-i; k++){
                System.out.print(" ");
            }
            for(int l=0; l<2*i-1; l++){
                System.out.print("*");
            }
            for(int k=0; k<3-i; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
	}
	
    //4. 피라미드 변형 별찍기
    //      *  
    //     *** 
    //    *****
    //   *     *
    //  ***   ***
    // ***** *****
}