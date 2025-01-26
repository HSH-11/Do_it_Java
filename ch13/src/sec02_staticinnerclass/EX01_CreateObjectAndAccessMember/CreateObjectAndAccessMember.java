package sec02_staticinnerclass.EX01_CreateObjectAndAccessMember;

class A {
	int a = 3;
	static int b = 4;
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}	
	//static inner class
	static class B {
		void bcd() {
			//필드 사용
			//System.out.println(a); //static은 static만 포함 가능 
			System.out.println(b);
			//메서드 호출
			//method1();//static은 static만 포함 가능
			method2();
		}
	}
}
public class CreateObjectAndAccessMember {

	public static void main(String[] args) {
		A.B b = new A.B(); //객체 A를 생성하지 않고 바로 클래스명으로 정적 클래스 B를 호출
		b.bcd();

	}

}
