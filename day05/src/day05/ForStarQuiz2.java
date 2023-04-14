package day05;

import java.util.Scanner;

public class ForStarQuiz2 {

	public static void main(String[] args) {
		//     * n-1
		//    ** n-2
		//   *** n-3
		//  **** n-4
		// ***** n-5
		
		Scanner scan = new Scanner(System.in);
		int starTowerFloor = scan.nextInt();
		scan.close();
		
		for(int i=1; i<=starTowerFloor; i++){ 
			for(int j=starTowerFloor-i; j>=1; j--){
				System.out.print(" ");
				}for(int k=1; k<=i; k++) {
				System.out.print("*");
				}
			System.out.println();
			}
	}
}
