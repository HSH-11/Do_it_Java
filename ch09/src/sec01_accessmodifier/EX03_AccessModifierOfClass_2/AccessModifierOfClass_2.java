package sec01_accessmodifier.EX03_AccessModifierOfClass_2;
//Ŭ���� AA,BB,CC�� �ٸ� ��Ű���� ��ġ
import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.AA;
//import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.BB; //�Ұ���
//(default�̹Ƿ� �ٸ� ��Ű������ ȣ�� �Ұ�)
import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.CC;

public class AccessModifierOfClass_2 {
	public static void main(String[] args) {
		//��ü ����
		AA a = new AA(); //��ü��������(A a) + ������ ȣ�� ����(new AA())
		//BB b = new BB(); //��ü�����Ұ���(BB b) 
		//CC c = new CC(); //��ü��������(CC c) + ������ ȣ�� �Ұ���(new CC())
		//CC Ŭ������ �����ڴ� default �����ڷ� �����Ǿ� ������ ȣ�� �Ұ���
	}
}