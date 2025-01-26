package sec05_innerinterface.EX01_CreateObjectOfInnerInterface;

class A {
	interface B {//static ���� �� �����Ϸ��� �ڵ� �߰�
		public abstract void bcd();
	}
}

class C implements A.B {
	public void bcd() {
		System.out.println("�̳��������̽� ���� Ŭ���� ����");
	}
}

public class CreateObjectOfInnerInterface {

	public static void main(String[] args) {
		// ��ü���� ��� #1 (�ڽ�Ŭ���� ���� ����)
		A.B ab = new C();
		C c = new C();
		c.bcd();

		// ��ü���� ��� #2 (�͸��̳�Ŭ���� ����)
		A.B b = new A.B() {
			public void bcd() {
				System.out.println("�͸��̳�Ŭ������ ��ü ����");
			}
		};
		b.bcd();

	}

}
