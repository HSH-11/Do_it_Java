package sec04_userexception.EX02_ExceptionMethod_1;
//getMessage()는 Exception 클래스의 부모 클래스인 Throwable 클래스의 메서드이다.
//getMessage()는 예외가 발생하면 생성자로 넘긴 메시지를 문자열 형태로 리턴하는 메서드
public class ExceptionMethod_1 {

	public static void main(String[] args) {
		// #1. 예외객체 생성시 메시지 전달하지 않는 경우
		try {
			throw new Exception(); // 이 시점에서 예외 발생
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// #2. 예외객체 생성시 메시지 전달하는 경우
		try {
			throw new Exception("예외메세지"); // 이 시점에서 예외 발생
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
