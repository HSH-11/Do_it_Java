package sec02_exceptionhandlingsyntax.EX06_TryWithResouce_2;

//리소스 자동 해제를 위한 클래스는 반드시 이 AutoCloseable 인터페이스를 구현
class A implements AutoCloseable {
	String resource;

	A(String resouce) {
		this.resource = resouce;
	}

	@Override
	public void close() throws Exception {
		if (resource != null) {
			resource = null;
			System.out.println("리소스가 해제되었습니다.");
		}
	}
}

public class TryWithResouce_2 {
	public static void main(String[] args) {

		//리소스를 사용하고 finally에서 리소스 수동 해제하기
		A a1 = null;
		try {
			a1 = new A("특정파일");
		} catch (Exception e) {
			System.out.println("예외처리");
		} finally {
			// 리소스 수동 해제
			if (a1.resource != null) {
				try {
					a1.close();
				} catch (Exception e) {
				}
			}
		}

		//자동 리소스 해제
		try (A a2 = new A("특정파일");) {//클래스 A의 close를 통한 자동 리소스 해제

		} catch (Exception e) {
			System.out.println("예외처리");
		}
	}
}
