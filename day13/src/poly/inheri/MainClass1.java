package poly.inheri;

public class MainClass1 {

	public static void main(String[] args) {

		Warrior w1 = new Warrior("전사");
		Rabbit r1 = new Rabbit();
		Rat ra1 = new Rat();
		
		w1.showStatus();
		
		w1.hunt(r1);
		w1.hunt(ra1);
		w1.showStatus();

		w1.hunt(ra1);

		w1.showStatus();

	}

}
