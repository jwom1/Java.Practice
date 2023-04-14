package poly.noinheri;

public class MainClass4 {
	public static void main(String[] args) {
		
		Pig p1 = new Pig();
		
		Warrior w1 = new Warrior("자바전사");

		w1.showStatus();
		
		w1.huntPig(p1);
		
	}

}
