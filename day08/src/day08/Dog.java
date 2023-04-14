package day08;

public class Dog {

	public String name;
	public String kind;
	public String like;
	public int age;
	
	
	public Dog(String n, String k, String l, int a) {
		name = n;
		kind= k;
		like = l;
		age = a;
	}
	
	public void showDog() {
		System.out.println(name);
		System.out.println(kind);
		System.out.println(like);
		System.out.println(age);

	}

	
	
}