package abstract_abs;

public class Store extends PopupStore{
	
	@Override
	public void orderApple() {
		System.out.println("착즙사과주스는 20000원입니다.");
	}
	@Override
	public void orderOrange() {
		System.out.println("착즙오렌지주스는 24000원입니다.");
	}
	@Override
	public void orderGrape() {
		System.out.println("착즙포도주스는 15000원입니다.");
	}
}
