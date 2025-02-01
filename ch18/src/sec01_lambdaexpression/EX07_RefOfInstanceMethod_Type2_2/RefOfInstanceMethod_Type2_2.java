package sec01_lambdaexpression.EX07_RefOfInstanceMethod_Type2_2;

interface A {
	int abc(String str);
}

public class RefOfInstanceMethod_Type2_2 {
	public static void main(String[] args) {
		//# �ν��Ͻ� �޼��� ���� Type2
		//@1. �͸��̳�Ŭ���� 
		A a1 = new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};

		//@2.���ٽ�
		A a2 = (String str)-> str.length();
		
		//@3. �ν��Ͻ� �޼��� ���� Type2 
		A a3 = String::length;
		
		System.out.println(a1.abc("�ȳ�"));
		System.out.println(a2.abc("�ȳ�"));
		System.out.println(a3.abc("�ȳ�"));

	}
}