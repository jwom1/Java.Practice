package day08;

public class Cat {
	
	public String name;
	public int age;
	public String kind;
	public String color;
	
	public Cat(String n,int a, String k, String c) {
		name = n;
		age = a;
		kind = k; // 멤버변수 = 지역변수
		color = c;
	}
	
	// 설계 클래스 내부에 선언하는 메서드는 static을 쓰지 않습니다.
	public void showCatInfo() {
		System.out.println(name);		
		System.out.println(age);
		System.out.println(kind);
		System.out.println(color);
	}
	
}
