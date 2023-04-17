package static_singleton;

public class MainClass {
	public static void main(String[] args) {
		//Singleton 객체는 생성자가 private이므로 인스턴스 생성 불거
		//Singleton s1 = mew Singleton();
		//s1.getInstace();
	
		Singleton s1 = Singleton.getInstance();
		System.out.println("s1의 주소 : " + s1);

		Singleton s2 = Singleton.getInstance();
		System.out.println("s2의 주소 : " + s2);
	}
}
