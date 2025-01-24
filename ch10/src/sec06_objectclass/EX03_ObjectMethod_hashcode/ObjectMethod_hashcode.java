package sec06_objectclass.EX03_ObjectMethod_hashcode;
import java.util.HashMap;

class A {
	String name;
	A(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name) {
			return true;
		} else 
			return false;
	}	
	@Override
	public String toString() {	
		return name;
	}
}
class B {
	String name;
	B(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name) {
			return true;
		} else 
			return false;
	}
	@Override
	public int hashCode() {		
		return name.hashCode();
	}
	@Override
	public String toString() {	
		return name;
	}
}
public class ObjectMethod_hashcode {

	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "������1");
		hm1.put(1, "������2");
		hm1.put(2, "������3");
		System.out.println(hm1);//{1=������2, 2=������3}
		
		HashMap<A, String> hm2 = new HashMap<>();
		//Object Ŭ������ hashcode�ε� �� ��ü�� ���� �ٸ� ��ġ�� �����ǹǷ� ���� �ٸ� 
		hm2.put(new A("ù��°"), "������1");
		hm2.put(new A("ù��°"), "������2");
		hm2.put(new A("�ι�°"), "������3");
		System.out.println(hm2);//{ù��°=������2, �ι�°=������3, ù��°=������1}
		
		HashMap<B, String> hm3 = new HashMap<>();//�������̵��Ͽ� name.hashcode ��, String ���ͷ��� ��ġ���� ���Ͽ� ����
		hm3.put(new B("ù��°"), "������1");
		hm3.put(new B("ù��°"), "������2");
		hm3.put(new B("�ι�°"), "������3");
		System.out.println(hm3);//{ù��°=������2, �ι�°=������3}

	}

}
