package sec01_packageimport.EX01_PackageImport_1;

public class PackageImport_1 {
	public static void main(String[] args) {		

		//A a = new A(); //����Ʈ ���� �ٸ� ��Ű�� ���� Ŭ���� ���� �� ����
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		//���Ȱ��
		System.out.println(a.m); //3
		System.out.println(a.n); //4
		a.print(); //����Ʈ
	}
}
