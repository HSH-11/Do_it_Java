package sec04_thiskeyword.EX02_ThisKeyword_2;
/*명시적 this 키워드 추가 */

class A {
	//필드는 int인 경우 0으로 초기화
	int m;
	int n;
	
	void init(int m, int n) {
		//필드명과 지역변수 명이 같은 경우 컴파일러는 m,n을 사용범위가 적은 지역변수로 인식
		//따라서 this.이 추가되지 않으며, 지역변수에 지역변숫값을 다시 대입하는 형태가 되어 필드 값에는 영향이 없다.
		m=m; 
		n=n; 
	}
}
class B {
	int m;
	int n;	
	void init(int m, int n) {
		this.m=m; 
		this.n=n; 
	}
}
public class ThisKeyword_2 {

	public static void main(String[] args) {
		//#1. 필드명과 지역변수 명이 같은 경우 (this 키워드를 사용하지 않은 경우)
		A a = new A();
		a.init(2, 3);
		System.out.println(a.m); // 0
		System.out.println(a.n); // 0

		// #2. 필드명과 지역변수 명이 같은 경우 (this 키워드를 직접 사용하는 경우)
		B b = new B();
		b.init(2, 3);
		System.out.println(b.m); // 2
		System.out.println(b.n); // 3

	}

}
