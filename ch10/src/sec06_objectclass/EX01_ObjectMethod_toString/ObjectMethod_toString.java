package sec06_objectclass.EX01_ObjectMethod_toString;
/*Object Ŭ������ toString() �޼���*/

class A { //extends Object (�����Ϸ��� ���ؼ� �ڵ��߰�)
	int a=3;
	int b=4;
}
class B {
	int a=3;
	int b=4;

	public String toString() {		
		return "�ʵ尪(a, b) =" + a +" " +b;
	}	
}
public class ObjectMethod_toString {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.printf("%x\n", a.hashCode()); //hashcode�� 16������ ǥ��
		System.out.println(a.toString()); //toString()�޼���� ������ �ڵ� �߰�
		System.out.println(b);

	}

}
