package sec01_packageimport.EX02_PackageImport_2;

import sec01_packageimport.common.A;//����Ʈ ���
//���� import ����� �ҽ��ڵ尡 �ƴ� bin ������ ��ġ�� �������� �Ϸ�� ����Ʈ �ڵ��̴�(.class)
//�߰������� import �Ҷ� * ��ȣ�� ����Ͽ� ����Ʈ�ϸ� ���� ������ ����Ʈ ���� �ʰ�, Ŭ���� ���ϵ鸸 ����Ʈ�ȴ�.
public class PackageImport_2 {
	public static void main(String[] args) {		
		//��ü����
		A a = new A(); //������
		
		//���Ȱ��
		System.out.println(a.m); //3
		System.out.println(a.n); //4
		a.print(); //����Ʈ
	}
}
