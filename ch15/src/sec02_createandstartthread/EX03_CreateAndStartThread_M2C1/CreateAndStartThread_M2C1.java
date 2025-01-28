package sec02_createandstartthread.EX03_CreateAndStartThread_M2C1;

//���2(M2). Runnable �������̽� ����Ͽ� Ŭ���� ����  case2: 2���� ������ ����

class SMIFileRunnable implements Runnable {
	@Override
	public void run() {
		// �ڸ� ��ȣ �ϳ�~�ټ�
		String[] strArray = { "�ϳ�", "��", "��", "��", "�ټ�" };
		try {
			Thread.sleep(10);
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

public class CreateAndStartThread_M2C1 {
	public static void main(String[] args) {

		// SMIRunnable ��ü ����
		Runnable smiFileRunnable = new SMIFileRunnable();
		// smiFileRunnable.start(); //Runnable ��ü���� start()�޼��尡 ���� ���� �߻�
		Thread thread = new Thread(smiFileRunnable);
		thread.start();

		//���������� 1~5
		int[] intArray = { 1, 2, 3, 4, 5 };

		//���� ������ ���
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(����������) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}

	}
}
