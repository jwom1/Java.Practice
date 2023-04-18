package abstract_abs;

public class MainClass {

	public static void main(String[] args) {
		// 상속을 전제로 만든 PopupStore는 객체 생성 불가능
		// PopupStore ps = new PopupStore();
		
		PopupStore ps = new Store();
		ps.orderApple();
		ps.orderOrange();
		ps.orderGrape();
		
		ps.refund();

	}

}
