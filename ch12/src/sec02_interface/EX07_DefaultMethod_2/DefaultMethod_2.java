package sec02_interface.EX07_DefaultMethod_2;

/*자식클래스에서 부모인터페이스의 디폴트메서드 호출*/

interface A {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

class B implements A {
	public void abc() {
		A.super.abc(); // super.abc() 이건 부모클래스의 abc() 메서드 호출하란 소리
		System.out.println("B 클래스의 abc()");
	}
	public void bcd() {
		System.out.println("B 클래스의 bcd()");
	}
}

public class DefaultMethod_2 {

	public static void main(String[] args) {
		A b = new B();
		
		// 메서드 호출
		b.abc(); // A 인터페이스의 abc() B 클래스의 abc()
		// b.bcd(); 인터페이스 A안에 bcd()가 없으므로 접근 불가

	}

}
