package sec04_anonymousclass.EX02_AnonymousClass_2;

class A {
	C c = new C() {
		public void bcd() {
			System.out.println("�͸��̳�Ŭ����");			
		}
	};	
	void abc() {
		c.bcd();
	}		
}
interface C {
	public abstract void bcd();
}
public class AnonymousClass_2 {
	public static void main(String[] args) {
		//��ü ���� �� �޼��� ȣ��
		A a = new A();
		a.abc(); //�͸��̳�Ŭ����
	}
}
