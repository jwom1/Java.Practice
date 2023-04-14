package day02;

public class IntegerExample {

	public static void main(String[] args) {
		
		int maxInt = 2147483647;
		// 자료값에는 최댓값이 존재한다
		// 만약 그 최댓값을 넘어서면 다시 최저값으로 시작하게 된다.
		System.out.println( maxInt + 10); 
		// 01111111 11111111 11111111 11111111
	    // 00000000 00000000 00000000 00001010
		// 1------- -------- -------- --------
		
		int minInt = -2147483648;
		// 최저값에서 값을 또 빼면 최댓값으로 변환된다. 
		System.out.println( minInt - 1);
		// 2147483647로 도출된다.
	}

}
