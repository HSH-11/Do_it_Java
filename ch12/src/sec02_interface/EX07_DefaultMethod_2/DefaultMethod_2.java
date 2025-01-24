package sec02_interface.EX07_DefaultMethod_2;

/*�ڽ�Ŭ�������� �θ��������̽��� ����Ʈ�޼��� ȣ��*/

interface A {
	default void abc() {
		System.out.println("A �������̽��� abc()");
	}
}

class B implements A {
	public void abc() {
		A.super.abc(); // super.abc() �̰� �θ�Ŭ������ abc() �޼��� ȣ���϶� �Ҹ�
		System.out.println("B Ŭ������ abc()");
	}
	public void bcd() {
		System.out.println("B Ŭ������ bcd()");
	}
}

public class DefaultMethod_2 {

	public static void main(String[] args) {
		A b = new B();
		
		// �޼��� ȣ��
		b.abc(); // A �������̽��� abc() B Ŭ������ abc()
		// b.bcd(); �������̽� A�ȿ� bcd()�� �����Ƿ� ���� �Ұ�

	}

}
