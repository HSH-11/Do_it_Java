package sec04_userexception.EX02_ExceptionMethod_1;
//getMessage()�� Exception Ŭ������ �θ� Ŭ������ Throwable Ŭ������ �޼����̴�.
//getMessage()�� ���ܰ� �߻��ϸ� �����ڷ� �ѱ� �޽����� ���ڿ� ���·� �����ϴ� �޼���
public class ExceptionMethod_1 {

	public static void main(String[] args) {
		// #1. ���ܰ�ü ������ �޽��� �������� �ʴ� ���
		try {
			throw new Exception(); // �� �������� ���� �߻�
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// #2. ���ܰ�ü ������ �޽��� �����ϴ� ���
		try {
			throw new Exception("���ܸ޼���"); // �� �������� ���� �߻�
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
