package sec04_anonymousclass.EX02_AnonymousClass_2;

class A {
	C c = new C() {
		public void bcd() {
			System.out.println("익명이너클래스");			
		}
	};	
	void abc() {
		c.bcd();
	}		
}
interface C {
	public abstract void bcd();
}
public class AnonymousClass_2 {
	public static void main(String[] args) {
		//객체 생성 및 메서드 호출
		A a = new A();
		a.abc(); //익명이너클래스
	}
}
