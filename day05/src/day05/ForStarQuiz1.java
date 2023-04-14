package day05;

import java.util.Scanner;

public class ForStarQuiz1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//중첩반복문을 사용하십시오
		// 바깥 반복문은 세로 길이를 나타냄
		// 안쪽 반복문은 별의 개수, 늘어나는 변수를 이용하세요
		// 줄이 바뀔 때마다 별 개수가 늘어나게 처리해주세요
		
		
		//추가 요구사항 : 사용자에게 스캐너로 층수를 입력받게 고쳐주세요.
		
		System.out.println("층수를 입력해주세요.");
		int starTowerFloor = scan.nextInt();
		scan.close();
		
		for(int i=1; i<=starTowerFloor; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}//내부if
			
		System.out.println();
		
		}//외부if
	}//메인
}//클래스
