package sec05_threadstates.EX06_Waiting_WaitNotify_1;
//����ȭ�� ������� �� �������� �� �������� ���� ����
class DataBox {
	int data;
	synchronized void inputData(int data) {
		this.data = data;
		System.out.println("�Էµ����� : "+data);
	}
	synchronized void outputData() {
		System.out.println("��µ����� : "+data);
	}
}

public class Waiting_WaitNotify_1 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		Thread t1 = new Thread() {
			public void run() {
				for(int i=1; i<9; i++) {
					dataBox.inputData(i);
				}
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=1; i<9; i++) {
					dataBox.outputData();
				}
			};
		};
		
		t1.start();
		t2.start();
	}
	/*���� ���
	 * �Էµ����� : 1 �Էµ����� : 2 �Էµ����� : 3 �Էµ����� : 4 �Էµ����� : 5 �Էµ����� : 6 �Էµ����� : 7 �Էµ����� :
	 * 8 ��µ����� : 8 ��µ����� : 8 ��µ����� : 8 ��µ����� : 8 ��µ����� : 8 ��µ����� : 8 ��µ����� : 8 ��µ�����
	 * : 8
	 */
}
