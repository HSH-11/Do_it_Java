package sec01_instanceinnerclass.EX01_CreateObjectAndAccessMember;

class A {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;

	void abc() {
		System.out.println("A Ŭ���� �޼��� abc()");
	}

	// �ν��Ͻ� �̳�Ŭ����
	class B {
		void bcd() {
			//outer class�� �ʵ� ���
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			//outer class�� �޼��� ȣ��
			abc();
		}
	}
}

public class CreateObjectAndAccessMember {

	public static void main(String[] args) {
		//��ü���� �ܰ� outer class ��ü ����
		A a = new A();
		//��� ���
		A.B b = a.new B();
		b.bcd();

	}

}
