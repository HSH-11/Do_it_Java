package sec01_lambdaexpression.EX01_OOPvsFP;

interface A {
	void abc();
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("�޼��� ���� 1");
	}
}

public class OOPvsFP {
	public static void main(String[] args) {
		//#1. ��ü���� ���α׷��� ���� 1(case1)
		A a1 = new B();
		a1.abc(); // �޼��� ����
		

		//#2. ��ü���� ���α׷��� ���� 2 (case2) : �͸��̳�Ŭ���� ���
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("�޼��� ���� 2");
			}
		};
		a2.abc(); //�޼��� ����
		
		//#3. �Լ��� ���α׷��� ���� (���ٽ�) (case3)
		A a3 =  ()->{System.out.println("�޼��� ���� 3");};
		a3.abc();
	}
}