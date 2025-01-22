package sec04_thiskeyword.EX01_ThisKeyword_1;
/*묵시적 this 키워드 자동 추가 */
//모든 메서드에는 자신이 포함된 클래스의 객체를 가리키는 this라는 참조 변수가 존재
//this는 인스턴스 메서드 내부에서만 사용가능하며 static 메서드 내부에서는 사용할 수 없다
//#1. 클래스내부에서 필드, 메서드에 앞에 붙는 자동으로 붙는 this 키워드
class A {
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c=3;
		m=a; //this. 생략시 자동 추가
		this.n=b; //this. 생략시 자동 추가
	}
	void work() {
		this.init(2,3); //this. 생략시 자동 추가
	}
}
public class ThisKeyword_1 {

	public static void main(String[] args) {
		//#2. 클래스 객체 생성
		A a = new A();
		// #3. 메서드 호출 / 필드값 활용
		a.work();
		System.out.println(a.m); // 2
		System.out.println(a.n); // 3

	}

}
