package poly.static_.var;

public class Asean {
	// 실용영어 - 조별과제 시킴
	// 태국어 1명 - 마인어 3명
	// Asean조
	// 출석20 + 발표30 + 기말50
	private int attendenceScore; //출결
	private int finalTermScore; //기말
	private String name;

	// 종훈, 일윤 은영, 재인
	public static int presentationScore;// 29

	public Asean(String name, int attendenceScore, int finalTermScore) {
		this.name = name;
		this.attendenceScore = attendenceScore;
		this.finalTermScore = finalTermScore;
	}

	static {
		presentationScore = 29;
	}
	
	public void showStudentScor() {
		System.out.println("학생명 : " + this.name);
		System.out.println("출석점수 : " + this.attendenceScore);
		System.out.println("팀점수 : " + presentationScore);
		System.out.println("기말점수 : " + this.finalTermScore);
		System.out.println("최종성적 : " + (attendenceScore + presentationScore + finalTermScore));
		System.out.println("---------------------------");
	}
	
	
}
