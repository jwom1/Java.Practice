package day02;

public class FloatExample {

	public static void main(String[] args) {
		// 매직넘버 실수는 double이기 때문에 float에 저장할때는 
		// 뒤에 f(대소문자 구분x)를 붙여 float으로 바꿔줍니다.
		float f1 = 7.12345f;
		double d1 = 7.12345;
		System.out.println(f1);
		System.out.println(d1);
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		float f2 = 1.234567891234f;
		double d2 = 1.234567891234;
		System.out.println(f2);// float자료형이 표현범위가 좁아서 뒷자리가 잘림.
		System.out.println(d2);

	}

}
