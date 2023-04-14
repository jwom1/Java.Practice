package day06;

public class ANestedForQuizXY {

	public static void main(String[] args) {
		for(int x=1; x<15; x++) {      // (4*x)를 했을 때 60보다 작은 경우의 수 범위

			for(int y=1; y<12; y++) {     //(5*y)를 했을 때 60보다 작은 경우의 수 범위

			// 조건식을 이용해 방정식의 해가 구해진 경우만 출력

			if((4 * x)+(5 * y)== 60)

			System.out.println(x+ "," + y); //조건식의 타킷이 1줄인 경우

			}
		}
	}
}