package day07;

public class CatMain {

	//고양이 조회를 위한 전용 메서드 
	public static void showCatInfo(Cat cat) {
		System.out.println("고양이 이름 : " + cat.name);
		System.out.println("고양이 나이 : " + cat.age);
		System.out.println("고양이 눈색 : " + cat.color);
		System.out.println("고양이 좋아하는것 : " + cat.like );
	}
	
	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		c1.name = "나비";
		c1.age = 5;
		c1.color = "blue";
		c1.like = "캣닢";
		
		Cat c2 = new Cat();
		c2.name = "호두";
		c2.age = 4;
		c2.color = "green";
		c2.like = "연어";
		
		Cat c3 = new Cat();
		c3.name = "봄이";
		c3.age = 6;
		c3.color = "blue";
		c3.like = "장난감";
	
		
		showCatInfo(c1);
		showCatInfo(c2);
		showCatInfo(c3);

		

	}

}
