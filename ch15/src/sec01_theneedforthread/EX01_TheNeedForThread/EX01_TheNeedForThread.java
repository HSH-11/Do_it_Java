package sec01_theneedforthread.EX01_TheNeedForThread;
//���� �����Ӱ� �ڸ��� ���� ������� ���
public class EX01_TheNeedForThread {

	public static void main(String[] args) {
		// ���������� 1~5
		int[] intArray = { 1, 2, 3, 4, 5 };

		// �ڸ� ��ȣ �ϳ�~�ټ�
		String[] strArray = { "�ϳ�", "��", "��", "��", "�ټ�" };

		// ���� ������ ���
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("(����������) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}

		// �ڸ���ȣ ���
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("(�ڸ���ȣ) " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}

}
