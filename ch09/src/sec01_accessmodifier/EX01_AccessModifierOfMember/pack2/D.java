package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class D extends A {
	public void print() { //a, b, c, d		
		//#��� Ȱ��
		System.out.print(a+ " "); //���� 
		System.out.print(b+ " "); //���� protected�� �ٸ� ��Ű�� �ڽ� Ŭ���� ����
		//System.out.print(c+ " "); //�Ұ���
		//System.out.print(d); //�Ұ���
		System.out.println();
	}
}
