package sec04_synchronizedmethodandblock.EX01_TheNeedsForSynchronized;
//동기화 사용 X
//# 공유객체
class MyData {
	int data = 3;
	
	public void plusData() {
		int mydata = data; //데이터를 가져오기
		try { Thread.sleep(2000);} catch (InterruptedException e) {}		
		data = mydata+1;
	}
}

//#공유객체를 사용하는 쓰레드 
class PlusThread extends Thread {
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData=myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행결과 : " + myData.data);
	}
}
public class TheNeedsForSynchronized {
	public static void main(String[] args) {
		//#공유객체 생성
		MyData myData = new MyData();
				
		//#1.  plusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try { Thread.sleep(1000);} catch (InterruptedException e) {}
		
		//#2.  plusThread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
//	실행 결과
//	plusThread1실행결과 : 4
//	plusThread2실행결과 : 4
//	why? 두번째 쓰레드가 data필드를 증가시키는 시점에 아직 첫번째 쓰레드의 실행이 끝나지 않았기 때문
}
