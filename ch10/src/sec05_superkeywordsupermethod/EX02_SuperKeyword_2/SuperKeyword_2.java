package sec05_superkeywordsupermethod.EX02_SuperKeyword_2;
class A {
	void abc() {
		System.out.println("A Ŭ������ abc()");
	}
}
class B extends A{	
	void abc() {
		System.out.println("B Ŭ������ abc()");
	}
	void bcd() {
		super.abc(); //�θ�Ŭ���� ��ü�� abc() �޼��� ȣ��;
	}
}
public class SuperKeyword_2 {

	public static void main(String[] args) {
		B bb = new B();

		bb.bcd(); // A Ŭ������ abc()

	}

}
