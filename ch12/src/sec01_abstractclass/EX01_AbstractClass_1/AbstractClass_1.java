package sec01_abstractclass.EX01_AbstractClass_1;

abstract class A {
	abstract void abc();
}

class B extends A {
	void abc() {
		System.out.println("방법#1. 자식클래스 생성 및 추상메서드 구현");
	}
}

public class AbstractClass_1 {

	public static void main(String[] args) {
		// 객체 생성
		B b1 = new B();
		A b2 = new B();

		// #2. 메서드 호출
		b1.abc(); // 방법#1. 자식클래스 생성 및 추상메서드 구현
		b2.abc(); // 방법#1. 자식클래스 생성 및 추상메서드 구현

	}

}
