package sec05_threadstates.EX03_TimedWaiting_Sleep;

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- sleep() ������ interrupt() �߻�");
			for(long i=0; i<1000000000L ; i++) {} //�ð�����
		}
	}
}

public class TimedWaiting_Sleep {
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		try {Thread.sleep(100);} catch (InterruptedException e) {} //������ ���� �غ�ð�
		System.out.println("MyThread State = " + myThread.getState()); //TIMED_WAITING
		
		myThread.interrupt();//myThread �����
		try {Thread.sleep(100);} catch (InterruptedException e) {} //���ͷ�Ʈ �غ�ð�
		System.out.println("MyThread State = " + myThread.getState()); //RUNNABLE
	}
}
