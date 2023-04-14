package day02;

public class UnaryExample {

	public static void main(String[] args) {
		// 증감연산자 ++,--
		int i = 1;
		int j = i++; // 후위연산자는 먼저 해당 코드를 수행하고, 뒤늦게 연산자 로직을 수행합니다.
		// int j = i 를 먼저 수행하고(i는 1)
		// i++를 수행해 1을 더합니다(i는 2)
		// 최종적으로 j는 1, i는 2를 저장받습니다.
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	
		int x = 1;
		int y = ++x;
		// 아래쪽에 주석으로 23, 24번라인에 출력될 값과 그 이유를 9, 10번라인처럼 서술해주세요.
		// 연산자가 앞에 존재하기 때문에 연산자 로직을 먼저 수행합니다.
		// ++x -> 1+x (x는 2)
		// y = x (y는 2)
		
		System.out.println(x);
		System.out.println(y);
	}

}
