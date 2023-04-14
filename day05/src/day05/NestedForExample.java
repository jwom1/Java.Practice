package day05;

public class NestedForExample {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
		
			for(int j=0; j<3; j++) {
				System.out.print("*"); //println이 아니고 print 입니다
				}
			System.out.println(); //줄 바꿈만 수행함
		}
	}
}