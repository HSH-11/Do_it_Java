package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class B {
	public void print() { //a, b, c, d
		//#��ü���� 
		A a = new A(); //��ü���� ����
		
		//#��� Ȱ��
		System.out.print(a.a+ " "); //����
		System.out.print(a.b+ " "); //����
		System.out.print(a.c+ " "); //����
		//Ŭ���� A�� ���� ��Ű���� �����Ƿ� public~default���� ����
		//System.out.print(a.d); //�Ұ��� private���� ���� �Ұ�
		System.out.println();
	}
}
