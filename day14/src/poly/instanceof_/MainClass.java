package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		// Human, Student, Cat 인스턴스를 생성해보세요.
		
		Human h1 = new Human("김자바",20);
		h1.showInfo();
		
		Student s1 = new Student("이학생",18);
		s1.showInfo();
		
		Cat c1 = new Cat("애웅",4);
		c1.meow();
		
		System.out.println(h1 instanceof Human);
		System.out.println(s1 instanceof Human);
		//관련이 아예 없는 객체간 비교는 에러발생
		//System.out.println(c1 instanceof Human);
		System.out.println(h1 instanceof Student);
		System.out.println(s1 instanceof Student);
		//System.out.println(c1 instanceof Student);

	}
}
