package sec03_throwsexception.EX02_ThrowsException_2;
// 최상위 메서드인 main()메서드가 예외를 전가했을 때 JVM이 발생한 예외의 정보를 화면에 출력하고 프로그램 강제종료
public class ThrowsException_2 {
	public static void main(String[] args) throws ClassNotFoundException{
		Class cls = Class.forName("java.lang.Object2");
	}
}
