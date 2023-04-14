package example.encap.good;


public class MyBirthday {

	/*
	 * 은닉(캡슐화) 시 변수는 무조건 private로 처리
	 */
	
	private int year;
	private int month;
	private int day;
	
	// alt+shift+s 혹은 마우스 우클릭 -> source
	// >> generate constructor using fields 선택
	public MyBirthday(int ear, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	void showDateInfo() {
		System.out.println("내 생일은");
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
	}
	
	/*
	 * 은닉된 변수에 접근하기 위해서는
	 * 클래스 설계시 미리 설정해둔 setter/getter 에서 메서드를
	 * 이용해 데이터에 접근해야 합니다.
	 */
	
	/*
	 *  -setter메서드 선언.
	 *  1. setter메서드는 은닉변수에 값을 저장(세팅)하기 위해 선언합니다.
	 *  2. 메서드의 접근제한자는 public으로 설정하고
	 *     이름은 일반적으로 set+변수명으로 지정합니다.
	 */
	public void setDay(int day) {
	if(day < 1 || day >31) {
			this.day=1; 
		}else {
			this.day = day;
		}
	}
	
	/*
	 *  - getter 메서드 선언
	 *  1. getter 메서드는 말 그래도 수를 get하는 용도입니다.
	 *  2. 값을 조회만 할 수 있고 변경은 불가능하기 때문에 직접조회보다 보안성을 높여줍니다.
	 *  3. 이름은 마찬가지로 get+ 변수명을 사용해 만듭니다.
	 */
	
	public int getDay() {
		return this.day;
	}
	
	
	// year, month
	
	public void setYear(int year) {
		if (year>2023) {
			this.year = 2023;
		}else if(year<0) {
			this.year = -year;
		}else {
			this.year = year;
		}
	}
		
	public int getYear() {
			return this.year;
		}
		
		
	public void setMonth(int month) {
		if(month>12) {
			this.month = month%12;
		}else if(month<1) {
			this.month = (-month % 12);
		}else {
			this.month = month;
		}	
	}
		
	public int getMonth() {
			return this.month;
		}
		
		
}


