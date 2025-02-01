package sec01_lambdaexpression.EX05_RefOfStaticMethod;

interface A {
	void abc();	
}

class B {
	static void bcd() {
		System.out.println("�޼���");
	}
}

public class RefOfStaticMethod {
	public static void main(String[] args) {
		//#. ���� �޼��� ����
		//��ü ���� ���ʿ�
		//@1. �͸��̳�Ŭ���� ���
		A a1 = new A() {
			@Override
			public void abc() {
				B.bcd();
			}
		};
		
		//@2. ���ٽ�
		A a2 = ()->{ B.bcd(); };
		
		//@3. �����޼��� ����
		A a3 = B::bcd;			
		
		a1.abc();
		a2.abc();
		a3.abc();
	}
}