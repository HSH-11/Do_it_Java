package sec01_lambdaexpression.EX02_FunctionToLambdaExpression;

interface A { // �Է� X   ���� X
	void method1();
}
interface B { // �Է� O   ���� X
	void method2(int a);
}
interface C { // �Է� X   ���� O
	int method3();
}
interface D { // �Է� O   ���� O
	double method4(int a, double b);
}

public class FunctionToLambdaExpression {
	public static void main(String[] args) {
		
		//�������̽��� �Լ� ���� --> ���ٽ�
		//#1. �Է� X   ���� X
		//@1-1 �͸��̳�Ŭ���� ���
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("�Է� x ���� x �Լ�");				
			}
		};
		//@1-2  ���ٽ� ǥ��
		A a2 = ()->{System.out.println("�Է� x ���� x �Լ�");};
		A a3 = ()->System.out.println("�Է� x ���� x �Լ�"); //�߰�ȣ ���� ���� (���� ����϶��� ����)
		
		//#2. �Է� O   ���� X
		//@2-1 �͸��̳�Ŭ���� ���
		B b1 = new B() {
			@Override
			public void method2(int a) {
				System.out.println("�Է� O ���� x �Լ�");		
			}
		};	
				
		//@2-2  ���ٽ� ǥ��
		B b2 = (int a)->{System.out.println("�Է� O ���� x �Լ�");};
		B b3 = (a)->{System.out.println("�Է� O ���� x �Լ�");}; //�Է¸Ű����� ���� ����
		B b4 = (a)->System.out.println("�Է� O ���� x �Լ�"); //�߰�ȣ ���� ���� (���� ����϶��� ����)
		B b5 = a->System.out.println("�Է� O ���� x �Լ�"); //�Է� �Ű������� �ϳ��� ��� �Ұ�ȣ�� ��������
		
		//#3. �Է� X   ���� O
		//@3-1 �͸��̳�Ŭ���� ���
		C c1 = new C() {
			@Override
			public int method3() {
				return 4;
			}
		};
		
		//@3-2  ���ٽ� ǥ��
		C c2 = ()->{ return 4; };
		C c3 = ()->4;
		
		
		//#4. �Է� O   ���� O
		//@4-1 �͸��̳�Ŭ���� ���
		D d1 = new D() {
			@Override
			public double method4(int a, double b) {				
				return a+b;
			}
		};
		
		//@4-2  ���ٽ� ǥ��
		D d2 = (int a, double b)->{return a+b;};
		D d3 = (a, b)->{return a+b;};
		D d4 = (a, b)-> a+b; //�ݵ�� �߰�ȣ ����
				
	}
}








