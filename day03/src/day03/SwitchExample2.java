package day03;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		// 앞서 배운 배열과 연동해서 코드를 작성해보겠습니다.
		Scanner scan = new Scanner(System.in);
		
		String[] foods = {"선지해장국", "어향가지", "장어덮밥", "알리오올리오", "퀘사디아"};
		
		// 0~4범위 난수를 얻도록 해주세요
	    int idx =(int)(Math.random()*5);
		
	    System.out.println(foods[idx]);
		switch(foods[idx]) {
				//여러분들의 최애 3개 요리는 case에서 체크해서
				//"XX식입니다"라고 출력하게 하고
				//나머지 2개가 걸린 경우에는 default문을 이용해 "기타요리입니다"라고 출력해주세요.
			case "선지해장국": 
			System.out.println("한식입니다.");
				break;
			case "어향가지": 
			System.out.println("중식입니다.");
				break;
			case "장어덮밥":
			System.out.println("일식입니다.");
				break;
			default:
			System.out.println("기타요리입니다.");
		}
	}

}
