package day06;

public class BForStarQuinz3_2 {

	//     *
	//    **
	//   ***
	//  ****
	// *****
	
	public static void main(String[] args) {
		// 중첩반복문을 쓰되, if문드로 " "와 "*"을 통제

	
		// 굳이 범위를 5 만드는 이유, 층위에 맞춰서 조절할 수 있어서 
		// 0으로 시작하는 것 보다 더 편하다.
		
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=5; k++) {
				//i의 값은 고정이고 5-k로 1부터 5까지 돌렸을 때, 첫텀에 4개가 true가 나오게 설계
				if(i<=5-k ) { 
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
