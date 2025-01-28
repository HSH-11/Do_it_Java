package sec03_threadproperties.EX05_ThreadProperties_3_3;

//�������� ���� ���� - ���� ������ + �Ϲ� ������

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon()? "���󾲷���":"�Ϲݾ�����") );
		for(int i =0; i<6; i++) {
			System.out.println(getName() + " : " + i + "��");
			try{Thread.sleep(1000);}catch(InterruptedException e) {}
		}
	}
}

public class ThreadProperties_3_3 {
	public static void main(String[] args) {
		
		//#1. �Ϲݾ�����
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);// �Ϲݾ������ ����
		thread1.setName("thread1");
		thread1.start();
		
		//#2. ���󾲷���
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);// ���󾲷���� ����
		thread2.setName("thread2");
		thread2.start();
		
		//#3. 3.5�� �� main Thread ����
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread ����");
	}
	//���� ������� �� �����尡 �ƴ϶� ���μ��� �� ��� �Ϲ� �����尡 ����ž� �����
}
