package day03;

public class BitOperaterExample {

	public static void main(String[] args) {
		byte a = 5;// 00000101
		byte b = 3;// 00000011
		
		//비트곱(and, &)
		System.out.println(a&b);

		//비트합(or, |)
		System.out.println(a|b);
		
		//배타적 논리합(xor, ^)
		System.out.println(a^b);
		
		// 비트 이동 연산자 (<<,>>)
		System.out.println(a<<4); // 00000101->01010000 (자릿수 4개 올려라)
		byte c = 48; // 00110000
		System.out.println(c>>3); // 48/2^3
	}

}
