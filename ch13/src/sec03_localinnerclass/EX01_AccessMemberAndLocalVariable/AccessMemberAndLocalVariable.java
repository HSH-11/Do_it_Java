package sec03_localinnerclass.EX01_AccessMemberAndLocalVariable;

class A {
	int a = 3; // �ʵ�

	void abc() {
		int b = 5; // ��������
		// �����̳�Ŭ����
		class B {
			void bcd() {
				System.out.println(a); // �ʵ�
				System.out.println(b); // ��������
				a = 5;
				// b=7; //�����̳�Ŭ�������� ����ϴ� ���������� �ڵ����� final b�� ����
			}
		}
		B bb = new B();
		bb.bcd();
	}
}

public class AccessMemberAndLocalVariable {

	public static void main(String[] args) {
		A a = new A();
		a.abc();

	}

}
