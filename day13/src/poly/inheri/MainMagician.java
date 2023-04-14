package poly.inheri;

public class MainMagician {

	public static void main(String[] args) {

		Monster r1 = new Rabbit();
		Monster ra1 = new Rat();
		
		Magician m1 = new Magician("자바술사");
		
		m1.showStatus();
		
		m1.castFireball(ra1);
		m1.castFireball(ra1);

		m1.showStatus();

		m1.castFireball(r1);
		
		m1.showStatus();

	}

}
