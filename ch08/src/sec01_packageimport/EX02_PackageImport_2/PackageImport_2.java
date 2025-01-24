package sec01_packageimport.EX02_PackageImport_2;

import sec01_packageimport.common.A;//임포트 사용
//실제 import 대상은 소스코드가 아닌 bin 폴더에 위치한 컴파일이 완료된 바이트 코드이다(.class)
//추가적으로 import 할때 * 기호를 사용하여 임포트하면 하위 폴더는 임포트 되지 않고, 클래스 파일들만 임포트된다.
public class PackageImport_2 {
	public static void main(String[] args) {		
		//객체생성
		A a = new A(); //정상동작
		
		//멤버활용
		System.out.println(a.m); //3
		System.out.println(a.n); //4
		a.print(); //임포트
	}
}
