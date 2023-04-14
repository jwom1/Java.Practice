package example.this_;

public class Car {

	public String model;
	public int speed;
	
	public Car(String m) {
		this.model = model; //인스턴스에 붙을 수 있는 대명사(this)
		this.speed = 0;     // 멤버변수를 지칭하고싶을 때 붙인다.
	
	}
	
	void accel() {
		if(this.speed +10 >= 150) {
			this.speed = 150;
		}else {
			this.speed += 10;
		}
	}
	
	void showStatus() {
		System.out.println("모델명 : " + this.model);
		System.out.println("현재속도 : " + this.speed);		
	}
}
