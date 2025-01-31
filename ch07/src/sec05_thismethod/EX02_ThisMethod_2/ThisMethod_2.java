package sec05_thismethod.EX02_ThisMethod_2;

/*this(생성자 매개변수) 활용*/
// 생성자의 중복을 제거할 수 있음
class A {
	int m1, m2, m3, m4;
	A() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	A(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	A(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4);	
		System.out.println();
	}	
}
class B {
	int m1, m2, m3, m4;
	B() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	B(int a) {
		this();
		m1 = a;
	}
	B(int a, int b) {
		this(a);
		m2 = b;		
	}
	/* 첫번째 생성자 호출 + 두개의 코드 추가
	B(int a, int b) {
		this();
		m1 = a;
		m2 = b;
	}
	*/	
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4);	
		System.out.println();
	}	
}
public class ThisMethod_2 {

	public static void main(String[] args) {
		// #1. 세가지 객체 생성 (this() 미사용)
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(10, 20);
		a1.print();
		a2.print();
		a3.print();

		System.out.println();

		// #2. 세가지 객체 생성 (this() 사용)
		B b1 = new B();
		B b2 = new B(10);
		B b3 = new B(10, 20);
		b1.print();
		b2.print();
		b3.print();
	}

}
