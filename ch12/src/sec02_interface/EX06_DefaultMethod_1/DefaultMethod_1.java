package sec02_interface.EX06_DefaultMethod_1;

/*�������̽� ���� �� ����Ʈ�޼����� �������̵�*/

interface A { 
	void abc();
	default void bcd() {
		System.out.println("A �������̽��� bcd()");
	}
}
class B implements A {
	public void abc() { 
		System.out.println("B Ŭ������ abc()");
		//bcd() ���� �ʿ� x
	}
}
class C implements A {
	public void abc() {
		System.out.println("C Ŭ������ abc()");
	}
	public void bcd() {
		System.out.println("C Ŭ������ bcd()");
	}
}
public class DefaultMethod_1 {
	public static void main(String[] args) {
		
		A a1 = new B();
		A a2 = new C();		
		
		//�޼��� ȣ��
		a1.abc(); //B Ŭ������ abc()
		a1.bcd(); //A �������̽��� bcd()
		
		a2.abc(); //C Ŭ������ abc()
		a2.bcd(); //C Ŭ������ bcd()
	}
}
