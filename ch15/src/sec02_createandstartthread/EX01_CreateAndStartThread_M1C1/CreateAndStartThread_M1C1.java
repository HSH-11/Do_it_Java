package sec02_createandstartthread.EX01_CreateAndStartThread_M1C1;

//Thread Ŭ���� ����Ͽ� Ŭ���� ����  case1: 2���� ������ ����

class SMIFileThread extends Thread {
	@Override
	public void run() {
		// �ڸ� ��ȣ
		String[] strArray = { "�ϳ�", "��", "��", "��", "�ټ�" };
		try {
			Thread.sleep(10);//�ڸ���ȣ�� �׻� ���ȣ ��ȣ �ڿ� �������� ����
		} catch (InterruptedException e) {
		}
		// �ڸ���ȣ ���
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (�ڸ���ȣ) " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class CreateAndStartThread_M1C1 {
	public static void main(String[] args) {

		// SMIFileThread ��ü ���� �� ����
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();

		// ���������� 1~5
		int[] intArray = { 1, 2, 3, 4, 5 };

		// ���� ������ ���
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(����������) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}
