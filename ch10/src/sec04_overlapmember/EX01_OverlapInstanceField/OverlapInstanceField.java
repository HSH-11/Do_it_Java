package sec04_overlapmember.EX01_OverlapInstanceField;

class A {
	int m = 3;
}
class B extends A {
	int m = 4;
}
public class OverlapInstanceField {

	public static void main(String[] args) {
		//인스턴스 메서드와 다르게 인스턴스 필드는 분리된 공간에 저장되기 때문에 오버라이딩 발생 X
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//인스턴스 필드
		System.out.println(aa.m); //3		
		System.out.println(bb.m); //4
		System.out.println(ab.m); //3

	}

}
