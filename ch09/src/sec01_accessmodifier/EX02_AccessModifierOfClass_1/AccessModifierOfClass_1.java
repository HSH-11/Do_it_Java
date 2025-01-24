package sec01_accessmodifier.EX02_AccessModifierOfClass_1;

public class AccessModifierOfClass_1 {
	public static void main(String[] args) {		
		//객체 생성
		A a = new A(); //선언가능(A a) + 생성자 호출 가능(new A())
		B b = new B(); //선언가능(B b) + 생성자 호출 가능(new B())
		C c = new C(); //선언가능(C c) + 생성자 호출 가능(new C())
		//같은 패키지이므로 public,default 생성자 모두 호출 가능
	}
}
