package sec02_interface.EX06_DefaultMethod_1;

/*인터페이스 구현 및 디폴트메서드의 오버라이딩*/

interface A { 
	void abc();
	default void bcd() {
		System.out.println("A 인터페이스의 bcd()");
	}
}
class B implements A {
	public void abc() { 
		System.out.println("B 클래스의 abc()");
		//bcd() 정의 필요 x
	}
}
class C implements A {
	public void abc() {
		System.out.println("C 클래스의 abc()");
	}
	public void bcd() {
		System.out.println("C 클래스의 bcd()");
	}
}
public class DefaultMethod_1 {
	public static void main(String[] args) {
		
		A a1 = new B();
		A a2 = new C();		
		
		//메서드 호출
		a1.abc(); //B 클래스의 abc()
		a1.bcd(); //A 인터페이스의 bcd()
		
		a2.abc(); //C 클래스의 abc()
		a2.bcd(); //C 클래스의 bcd()
	}
}
