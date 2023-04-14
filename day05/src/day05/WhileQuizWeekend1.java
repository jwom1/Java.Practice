package day05;

import java.util.Scanner;

public class WhileQuizWeekend1 {
	public static void main(String[] args) {
	//컴퓨터와 스무고개 수 맞추기
		
	//먼저 난수를 하나 만듭니다
	int comValue = (int)(Math.random()*101);

	//스캐너를 생성합니다.
	Scanner scan = new Scanner(System.in);
	
	//사용자에게 숫자를 입력받게 해 주세요.
	System.out.println("0 ~ 100 사이의 숫자를 입력해주세요.");
	int userValue = scan.nextInt();
	
	//컴퓨터의 값과 입력숫자 값이 일치할 때까지 돌아가도록 해야함-> 불일치하면 계속 돌아가고, 일치하면 멈추는 로직이 필요
	while(comValue != userValue) {
		//불일치라면 먼저 업인지, 다운인지 알려주기
		if(comValue>userValue ){
			System.out.println(userValue);
			System.out.println("값을 올리세요.");
		}else{
			System.out.println(userValue);
			System.out.println("값을 내리세요.");	
		}
	
		//사용자에게 다시 userValue를 다시 입력받기
	    System.out.println("값을 다시 입력해주세요.");
	    userValue = scan.nextInt(); 
	    
		}//와일닫기
	
		scan.close();
		
	}//메인닫기
}//클래스닫기
