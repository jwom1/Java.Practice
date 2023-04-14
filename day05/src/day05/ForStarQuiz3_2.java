package day05;

public class ForStarQuiz3_2 {
	public static void main(String[] args) {
		//풀어봅시다.
		
		for(int i=1; i<=5; i++) {
			for(int j=1; i<=5; j++) {
				if(i<5-j) {
					System.out.println(" ");
				}
			}
		}
	}

}
