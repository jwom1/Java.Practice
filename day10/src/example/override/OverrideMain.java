package example.override;

public class OverrideMain {

	public static void main(String[] args) {
		//학생 클래스의 인트턴스를 생성해주세요.
		
		Student s1 = new Student();
		
		s1.name = "유학생";
		s1.age = 21;
		s1.major = "컴퓨터 과학";
		
		s1.자기소개하기();
		
		// 프로그래머 클래스의 인스턴스를 생성합니다.
		
		Programer p1 = new Programer();
		
		p1.name = "나개발";
		p1.age = 33;
		p1.program = "Java";
		p1.career = 5;
		
		p1.자기소개하기();
		p1.코딩하기();
	}

}
