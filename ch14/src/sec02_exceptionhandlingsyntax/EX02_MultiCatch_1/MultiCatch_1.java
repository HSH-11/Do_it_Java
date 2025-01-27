package sec02_exceptionhandlingsyntax.EX02_MultiCatch_1;
//try구문을 수행하였을 때 예외가 발생하면 JVM은 발생한 예외 타입의 객체를 생성해 catch(){}블록의 매개변수로 전달.
public class MultiCatch_1 {
	public static void main(String[] args) {

		// #1. 단일 try-catch
		try {
			System.out.println(3 / 0); // 실행예외 (ArithmeticException)
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}

		try {
			int num = Integer.parseInt("10A"); // 실행예외 (NumberFormatException)
		} catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
		System.out.println();

		// #2. 다중 try-catch
		try {
			System.out.println(3 / 0);//여기서 문제가 발생
			int num = Integer.parseInt("10A");//위 코드 문제로 인한 실행 X
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
