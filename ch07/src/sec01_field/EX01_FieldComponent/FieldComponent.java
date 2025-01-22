package sec01_field.EX01_FieldComponent;

class A {
	int m = 3;
	int n = 4;
	void work1() {
		int k = 5; //로컬 변수
		System.out.println(k);
		work2(3);
	}
	void work2(int i) {
		//i도 지역변수
		int j=4;
		System.out.println(i+j);
	}
}
public class FieldComponent {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.m);
		System.out.println(a.n);
		a.work1();

	}

}
