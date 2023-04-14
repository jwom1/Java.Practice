package day05;

import java.util.Scanner;

public class ForStarQuiz2_층위 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int starTower = scan.nextInt();
		scan.close();
						//층수제어
		for(int i=	starTower; i>=1; i--) {
			for(int j=1; j<=i; j++) { // 감소시켜야 하기 때문에 1->5 로 --
				System.out.print("*"); 
			}
		System.out.println();
		}
	}
}
