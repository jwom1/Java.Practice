package day05;

public class ForStarQuiz3 {
	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) { // 감소시켜야 하기 때문에 1->5 로 --
				System.out.print("*"); 
			}
		System.out.println();
		
		}
	}

}
