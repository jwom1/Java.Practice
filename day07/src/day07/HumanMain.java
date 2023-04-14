package day07;

public class HumanMain {
	public static void main(String[] args) {
		// 타 클래스에 정의된 요소를 이용해 main 내부에서 생성해 쓸 수 있습니다.
		
				// new키워드는 힙에 자료를 저장합니다.
				// 자료형 변수 = new 자료형();
				// 위 명령어로 구조체의 인스턴스를 생성할 수 있습니다.
				// new키워드릐 리턴자료는 해당 힙의 주소 
				
				// 사람 1 생성
				Human h1 = new Human();
				h1.name = "김재원";
				h1.age = 10;
				h1.height =160;
				
				System.out.println("사람 1의 이름 : "+ h1.name);
				System.out.println(h1);
				
				//사람 2 생성
				Human h2 = new Human();
				h2.name = "유재석";
				h2.age = 20;
				h2.height =200;
				
				System.out.println("사람 2의 나이 : "+ h2.age);

	}
}
