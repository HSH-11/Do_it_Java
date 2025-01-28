package sec04_synchronizedmethodandblock.EX04_KeyObject_1;

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
		synchronized(this) {
			for(int i=0; i<3; i++) {
				System.out.println(i + "번째");
				try { Thread.sleep(1000); } catch (InterruptedException e) {}
			}
		}
	}
}
public class KeyObject_1 {
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
//	실행결과
//	0sec
//	1sec
//	2sec
//	0번째
//	1번째
//	2번째
//	0초
//	1초
//	2초
//	why? abc(),bcd(),cde() 모두 this 객체의 열쇠를 사용하기 때문에 이들 중 1개의 메서드가
//	실행되는 도중에는 다른 어떤 메서드도 동시에 실행할 수 없다.
}
