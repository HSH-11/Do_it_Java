package sec04_overlapmember.EX01_OverlapInstanceField;

class A {
	int m = 3;
}
class B extends A {
	int m = 4;
}
public class OverlapInstanceField {

	public static void main(String[] args) {
		//�ν��Ͻ� �޼���� �ٸ��� �ν��Ͻ� �ʵ�� �и��� ������ ����Ǳ� ������ �������̵� �߻� X
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//�ν��Ͻ� �ʵ�
		System.out.println(aa.m); //3		
		System.out.println(bb.m); //4
		System.out.println(ab.m); //3

	}

}
