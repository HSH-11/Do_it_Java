package sec04_userexception.EX03_ExceptoinMethod_2;
//printStackTrace()�� Exception Ŭ������ �θ� Ŭ������ Throwable Ŭ������ �޼����̴�.
//printStackTrace()�� ���� �߻��� ���޵Ǵ� ��θ� �Ѵ��� ���� �ִ� �޼����̴�.
class A {
	void abc() throws NumberFormatException {
		bcd();
	}
	void bcd() throws NumberFormatException {
		cde();
	}
	void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");
	}
}
public class ExceptoinMethod_2 {
	public static void main(String[] args) {
		//�ᱹ main �޼��忡�� ���� ó��
		A a = new A();
		
		try {
			a.abc();		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
