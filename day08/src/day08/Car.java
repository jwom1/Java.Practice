package day08;

public class Car {
	
	public String modelName;//차종
	public int maxPassengers;//최대승객
	public int currentSpeed;//속도
	public String owner;//차주
	public int gas;//연료량
	
	//상수 선언은 final static으로 선언하면 됩니다.
	public final static int BOOST_SPEED = 10; //엑셀
	public final static int BREAK_SPEED = 10; //브레이크	
	
	//생성자 들어갈 자리
	public Car(String mN,int mP, int cS, String o, int g) {
		modelName = mN; //같은 이름을 쓰면 안됨. modelName!=modelName;
		maxPassengers = mP;
		currentSpeed = cS;
		owner = o;
		gas = g;
	}
	
	
	//가속가능
	public void accelerate() {
		currentSpeed += BOOST_SPEED;
	}
	
	//감속가능
	public void break_() {
		currentSpeed -=BREAK_SPEED;
	}

	//계기판 조회
	public void showStatus() {
		System.out.println("차종 :" + modelName );
		System.out.println("최대승객 :" + maxPassengers );
		System.out.println("현재속도 :" + currentSpeed );
		System.out.println("차주 :" + owner );
		System.out.println("연료량 :" + gas );

	}
	
}
