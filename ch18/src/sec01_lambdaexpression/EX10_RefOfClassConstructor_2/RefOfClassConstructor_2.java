package sec01_lambdaexpression.EX10_RefOfClassConstructor_2;

interface A {
	B abc(int k);
}

class B {
	
	  B() { 
		  System.out.println("ù��° ������"); 
	  } 
	  B(int k) {
		  System.out.println("�ι�° ������"); 
	  }
	 
}

public class RefOfClassConstructor_2 {
	public static void main(String[] args) {
		// Ŭ���� ������ ����
		// @1 �͸��̳�Ŭ����
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(3);
			}
		};

		// @2.���ٽ�
		A a2 = (int k) -> new B(3);

		// @3. Ŭ���� ������ ����
		A a3 = B::new;

		a1.abc(3); // �ι�° ������
		a2.abc(3); // �ι�° ������
		a3.abc(3); // �ι�° ������
	}
}
