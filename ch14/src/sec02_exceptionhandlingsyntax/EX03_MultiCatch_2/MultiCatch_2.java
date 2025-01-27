package sec02_exceptionhandlingsyntax.EX03_MultiCatch_2;

public class MultiCatch_2 {

	public static void main(String[] args) {
				//#1. catch 블록의 순서가 잘못된 경우 
				//try내 발생하는 예외들은 모두 Exception 클래스의 하위 클래스이므로 어떤 예외가
				//발생하든 첫번째 catch만 실행되어 아래에 있는 catch문은 unreachable code로 인한 오류 발생
				/*
				try {
					System.out.println(3/1);
					int num = Integer.parseInt("10A");			
				}
				catch(Exception e) {
					System.out.println("숫자는 0으로 나눌 수 없습니다.");			
				}
				catch(NumberFormatException e) {
					System.out.println("숫자로 바꿀 수 없습니다.");			
				}
				finally {
					System.out.println("프로그램 종료");
				}		
				*/
				
				//#2. catch 블록의 올바른 순서
				try {
					System.out.println(3 / 1);
					int num = Integer.parseInt("10A");//NumberFormatException
				} catch (NumberFormatException e) {
					System.out.println("숫자로 바꿀 수 없습니다.");
				} catch (Exception e) {
					System.out.println("숫자는 0으로 나눌 수 없습니다.");
				} finally {
					System.out.println("프로그램 종료");
				}

	}

}
