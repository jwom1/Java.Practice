package day08;

public class CarMain {
	public static void main(String[] args) {
		// 자동차를 한 대 생성해주시고
		// 값은 연료 100, 속도0, 나머지 요소는 자율적으로 초기화 해주세요
		// 엑셀 3번 밟고 계기판 조회, 브레이크 2번 밟고 계기판 조회하는 코드를 
		// 아래에 작성해주세요.
		
		// 좌변:      /우변: new->힙에 만들어라, car-> 생성자를 호출해라
		Car c1 = new Car("소나타",5, 0,"김재원",100); 	
				
		c1.accelerate();
		c1.accelerate();
		c1.accelerate();

		c1.break_();
		c1.break_();

		c1.showStatus();
}
}
