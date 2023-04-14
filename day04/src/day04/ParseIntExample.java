package day04;

public class ParseIntExample {

	public static void main(String[] args) {
		// 문자이지만, 숫자로만 이루어진 문자는 int형으로 교환할 수 있습니다.
		String str = "2002";
		
		// Integer.parseInt(str);
		int year = Integer.parseInt(str);
		
		System.out.println(year+1);
		System.out.println(str+1);
	
		
	}

}
