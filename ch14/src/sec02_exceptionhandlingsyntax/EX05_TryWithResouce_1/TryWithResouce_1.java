package sec02_exceptionhandlingsyntax.EX05_TryWithResouce_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResouce_1 {

	public static void main(String[] args) {
		System.out.println("문자를 입력하세요!");

		// System.in 리소스를 해제하면 더이상 콘솔입력이 불가
		// #1. 자동리소스 해제
		try (InputStreamReader isr1 = new InputStreamReader(System.in);) {
			char input = (char) isr1.read();
			System.out.println("입력글자 = " + input);
		} catch (IOException e) {//예외처리 구문이 완료되면 소괄호 내 생성된 객체의 close를 호출하여 자동으로 리소스 해제
			e.printStackTrace();
		}
		//위에서 리소스를 해제하였기 때문에 이후 InputStreamReader를 통한 콘솔 입력 사용 불가
		// #2. 수동리소스 해제
		InputStreamReader isr2 = null;
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char) isr2.read();
			System.out.println("입력글자  = " + input);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 리소스 해제 구문
			if (isr2 != null) {
				try { // 리소스 해제
					isr2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
