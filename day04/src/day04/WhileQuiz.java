package day04;

import java.util.Scanner;

public class WhileQuiz {
	public static void main(String[] args) {
	
	int count = 1;
		
	Scanner scan = new Scanner(System.in);
		
	//사용자가 범위를 설정 가능하도록 하기
	System.out.println("최대 범위를 입력해주세요.");
	int maxValue = scan.nextInt()+1;
	
	int comValue = (int)(Math.random()*maxValue);

	// 자바에서는 연속해서 변수를 선언하는 것이 불가능하므로
	// 반복문 바깥에서 선언해주고, 반복문 내부에서는 선언된 변수 값을 바꿔넣기만 한다.
	
	System.out.println("0 ~ " + (maxValue - 1)+ "사이의 숫자를 입력해주세요.");
	
	int userValue =-1;
	
	do {
		userValue = scan.nextInt();
	}while(userValue > (maxValue-1)|| userValue<0);

	while(comValue!=userValue ){
		count +=1;
		//불일치라면 먼저 업인지, 다운인지 알려주기
		//comValue의 userValue의 비교를 통해 업/다운을 판단할 수 있다.
		System.out.println(userValue);
		}if(comValue > userValue){
			System.out.println("올리세요.");	
		}else {
			System.out.println("내리세요.");
		}
		//사용자에게 다시 userValue를 다시 입력받기
	    System.out.println("값을 다시 입력해주세요.");
	    do {
	    	userValue = scan.nextInt();
	    }while(userValue > (maxValue-1)||userValue<0);
	    
	  
	}//메인닫기
}//클래스닫기
