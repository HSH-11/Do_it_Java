package sec05_threadstates.EX06_Waiting_WaitNotify_1;
//동기화만 사용했을 때 임의적인 두 쓰레드의 실행 순서
class DataBox {
	int data;
	synchronized void inputData(int data) {
		this.data = data;
		System.out.println("입력데이터 : "+data);
	}
	synchronized void outputData() {
		System.out.println("출력데이터 : "+data);
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
	/*실행 결과
	 * 입력데이터 : 1 입력데이터 : 2 입력데이터 : 3 입력데이터 : 4 입력데이터 : 5 입력데이터 : 6 입력데이터 : 7 입력데이터 :
	 * 8 출력데이터 : 8 출력데이터 : 8 출력데이터 : 8 출력데이터 : 8 출력데이터 : 8 출력데이터 : 8 출력데이터 : 8 출력데이터
	 * : 8
	 */
}
