package day08;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		
		//하나는 덩크슛에 성공하게, 하나는 실패하게 만들어주세요.
		
		BasketballPlayer b1 = new BasketballPlayer("바밤바", 197, 24, 30000);
		
		BasketballPlayer b2 = new BasketballPlayer("누가바", 177, 23, 50000);

		b1.showInfo();
		b1.dunkshoot();
		
		b2.showInfo();
		b2.dunkshoot();
		
	}
}
