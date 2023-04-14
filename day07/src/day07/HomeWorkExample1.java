package day07;

public class HomeWorkExample1 {

	public static void main(String[] args) {
		// 리스트 사용 방식
		// 메뉴 설정
		String[] menu = {"대창덮밥", "돈카츠", "순찌", "수제비", "죽", "초밥"};
		
		// 난수 구하기
		int idx = (int)(Math.random()*menu.length);
		
		//출력하기
		System.out.println(menu[idx]);
	}

}
