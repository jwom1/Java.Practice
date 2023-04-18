<<<<<<< HEAD
package final_field;

public class MainClass {
	public static void main(String[] args) {
		Person Kim = new Person("김자바");
		//Kim.nationality = "일본"; //final
		//Kim.name = "채자바"; //final
		Kim.age = 25;
		System.out.println("국적 : " + Kim.nationality); //public이므로 조회가능
		System.out.println("국적 : " + Kim.name); //public이므로 조회가능
		System.out.println("국적 : " + Kim.age); //public이므로 조회가능
	}
}
=======
package final_field;

public class MainClass {
	public static void main(String[] args) {
		Person Kim = new Person("김자바");
		//Kim.nationality = "일본"; //final
		//Kim.name = "채자바"; //final
		Kim.age = 25;
		System.out.println("국적 : " + Kim.nationality); //public이므로 조회가능
		System.out.println("국적 : " + Kim.name); //public이므로 조회가능
		System.out.println("국적 : " + Kim.age); //public이므로 조회가능
	}
}
>>>>>>> 56130b390091cffdd27dae4b4f588786badff995
