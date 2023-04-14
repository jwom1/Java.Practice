package day09;

public class GarbageCollectorTestMain {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			GarbageCollectorTest test = new GarbageCollectorTest(i);
			
			test = null;
				
			
		}
	}
}
