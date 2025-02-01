package sec01_lambdaexpression.EX03_RefOfIntanceMethod_Type1_1;

interface A {
	void abc();
}
class B {
	void bcd() {
		System.out.println("�޼���");
	}
}

public class RefOfIntanceMethod_Type1_1 {
	public static void main(String[] args) {
		
		//#1. �ν��Ͻ� �޼��� ���� type1 �͸��̳�Ŭ����
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		
		//#2. ���ٽ�
		A a2 = ()->{
			B b = new B();
			b.bcd();
		};
		
		//#3. �ν��Ͻ� ���� Type1�� ǥ��
		B b = new B();
		A a3 = b::bcd; //A �������̽� ������ abc() �޼���� ���� ���� b ��ü ������ �ν��Ͻ� �޼��� bcd()�� �����ϴ�
		
		a1.abc();
		a2.abc();
		a3.abc();		
	}
}