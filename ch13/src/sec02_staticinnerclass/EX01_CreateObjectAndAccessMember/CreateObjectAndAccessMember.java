package sec02_staticinnerclass.EX01_CreateObjectAndAccessMember;

class A {
	int a = 3;
	static int b = 4;
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}	
	//static inner class
	static class B {
		void bcd() {
			//�ʵ� ���
			//System.out.println(a); //static�� static�� ���� ���� 
			System.out.println(b);
			//�޼��� ȣ��
			//method1();//static�� static�� ���� ����
			method2();
		}
	}
}
public class CreateObjectAndAccessMember {

	public static void main(String[] args) {
		A.B b = new A.B(); //��ü A�� �������� �ʰ� �ٷ� Ŭ���������� ���� Ŭ���� B�� ȣ��
		b.bcd();

	}

}
