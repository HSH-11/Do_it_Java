package sec02_interface.EX03_InheritanceOfInterface_2;

/*�������̽� ��� �ڽ�Ŭ������ ����������*/
interface A {
	public abstract void abc(); 
}
interface B {
	void bcd(); //������ public abstract 
}
class C implements A {
	public void abc() {
		//...
	}
}
/* public -> default �Ұ���
class D implements B {	
	void bcd() {	//�ڽ��� �� ���� ���� ������ ������ ������ �Ұ���	
	}	
}
*/
public class InheritanceOfInterface_2 {

	public static void main(String[] args) {
		

	}

}
