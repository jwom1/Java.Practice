package example.overload;

public class Cat {

	
	public String name;
	public String kind;
	
    public Cat () { //void생성자 : 파라미터에 입력된 값이 x
    	name = "이름을 입력하지 않았습니다.";
    	kind = "품종을 입력하지 않았습니다.";
    }
    
    public Cat(String n, String k) {
    	name = n;
    	kind = k;
    	System.out.println("지금부터 이 아이의 이름은"+ n +"입니다.");
    }
    
    public void call() { //void 파라미터 메서드
    System.out.println("야옹아 이리와");
    }
    public void call(String name) {
        System.out.println(name +"야 이리와");
    }
}
