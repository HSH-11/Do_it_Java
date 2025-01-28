package sec03_threadproperties.EX03_ThreadProperties_3_1;
//�Ϲ� ������ ���� ����
class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "���󾲷���" : "�Ϲݾ�����"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " + i + "��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadProperties_3_1 {
	public static void main(String[] args) {

		// # �Ϲݾ�����
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);// ����Ʈ
		thread1.setName("thread1");
		thread1.start();

		// # 3.5�� �� main Thread ����
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
		}
		System.out.println("main Thread ����");
	}
	//�Ϲ� ������� �ٸ� �������� ���� ���ο� ������� �ڽ��� �۾��� ����� ������ ��� ����
}
