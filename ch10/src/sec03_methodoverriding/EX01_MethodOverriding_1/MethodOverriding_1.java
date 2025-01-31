package sec03_methodoverriding.EX01_MethodOverriding_1;

class A{
	void print() {
		System.out.println("A 클래스");
	}
}
class B extends A{
	@Override
	void print() {
		System.out.println("B 클래스");
	}
}

public class MethodOverriding_1 {

	public static void main(String[] args) {
		A aa = new A();
		aa.print(); //A 클래스
		
		//#2. B 타입 / B 생성자
		B bb = new B();
		bb.print(); //B 클래스
		
		//#3. A 타입 / B 생성자
		A ab = new B();
		ab.print(); //B 클래스 why? 오버라이딩으로 인해 A객체가 가리키는 ab.print는 "B 클래스"로 출력

	}

}
