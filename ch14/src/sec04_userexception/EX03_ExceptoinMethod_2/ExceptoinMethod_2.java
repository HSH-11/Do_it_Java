package sec04_userexception.EX03_ExceptoinMethod_2;
//printStackTrace()는 Exception 클래스의 부모 클래스인 Throwable 클래스의 메서드이다.
//printStackTrace()는 예외 발생이 전달되는 경로를 한눈에 볼수 있는 메서드이다.
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
		//결국 main 메서드에서 예외 처리
		A a = new A();
		
		try {
			a.abc();		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
