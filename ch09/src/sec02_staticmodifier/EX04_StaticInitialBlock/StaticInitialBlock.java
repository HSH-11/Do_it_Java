package sec02_staticmodifier.EX04_StaticInitialBlock;

class A {
	int a;
	static int b;
	static {//�����ʵ带 �ʱ�ȭ�ϱ� ���� ����:Ŭ������ �޸𸮿� �ε�� �� ����
		b = 5; // static �ʵ��� �ʱ�ȭ�� static {} ������ ����
		System.out.println("Ŭ���� A�� �ε��Ǿ����ϴ�!!");
	}//���� �ʵ�� ��ü�� �����Ǳ� �������� �ʱ�ȭ�� �����ؾ��� 

	A() {
		a = 3; // �ν��Ͻ� �ʵ� �ʱ�ȭ�� �����ڿ��� �Ϲ������� ����
		// b=5; �����ڿ����� ���� �ʵ带 �ʱ�ȭ �� �� ����
	}
}

public class StaticInitialBlock {
	public static void main(String[] args) {		
		System.out.println(A.b); //5		
	}
}
