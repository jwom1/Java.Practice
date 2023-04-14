package example.override;

public class Programer extends Human{
	
		public String program;
		public int career;
	
		@Override
		public void 코딩하기() {
			System.out.println(program + "을 이용해 코딩을 합니다.");
		}
		
		@Override
		public void 자기소개하기() {
			System.out.println("프로그램 : " + program);
			System.out.println("경력 : " + career);
			System.out.println(program + career + "년차 개발자입니다.");
		}
		
}

