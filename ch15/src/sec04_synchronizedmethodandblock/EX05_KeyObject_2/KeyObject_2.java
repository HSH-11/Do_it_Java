package sec04_synchronizedmethodandblock.EX05_KeyObject_2;

//동기화 메서드와 동기화 블록이 다른 열쇠를 사용할 때
class MyData {
	synchronized void abc() {
		for(int i=0; i<3; i++) {
			System.out.println(i + "sec");
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
		}
	}
	
	synchronized void bcd() {
		for(int i=0; i<3; i++) {
			System.out.println(i + "초");
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
		}		
	}
	
	void cde() {
		synchronized(new Object()) {
			for(int i=0; i<3; i++) {
				System.out.println(i + "번째");
				try { Thread.sleep(1000); } catch (InterruptedException e) {}
			}
		}
	}
}

public class KeyObject_2 {
	public static void main(String[] args) {
		//#공유객체
		MyData myData = new MyData();
		
		//#세개의 쓰레드가 각각의 메서드 호출
		new Thread() {
			public void run() {
				myData.abc();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.bcd();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.cde();
			};
		}.start();
	}
	//실행 결과
//	0sec
//	0번째
//	1번째
//	1sec
//	2번째
//	2sec
//	0초
//	1초
//	2초
//	why? cde()는 다른 열쇠를 사용하기에 동시 실행 가능
}
