package sec01_accessmodifier.EX03_AccessModifierOfClass_2;
//클래스 AA,BB,CC랑 다른 패키지에 위치
import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.AA;
//import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.BB; //불가능
//(default이므로 다른 패키지에서 호출 불가)
import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.CC;

public class AccessModifierOfClass_2 {
	public static void main(String[] args) {
		//객체 생성
		AA a = new AA(); //객체생성가능(A a) + 생성자 호출 가능(new AA())
		//BB b = new BB(); //객체생성불가능(BB b) 
		//CC c = new CC(); //객체생성가능(CC c) + 생성자 호출 불가능(new CC())
		//CC 클래스의 생성자는 default 생성자로 생성되어 생성자 호출 불가능
	}
}