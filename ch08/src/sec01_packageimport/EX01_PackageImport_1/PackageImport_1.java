package sec01_packageimport.EX01_PackageImport_1;

public class PackageImport_1 {
	public static void main(String[] args) {		

		//A a = new A(); //임포트 없이 다른 패키지 내의 클래스 생성 시 오류
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		//멤버활용
		System.out.println(a.m); //3
		System.out.println(a.n); //4
		a.print(); //임포트
	}
}
