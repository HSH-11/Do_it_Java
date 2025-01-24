package sec05_superkeywordsupermethod.EX03_SuperMethod_1;

class A{
	A(){
		System.out.println("A 생성자");
	}
}
class B extends A{
	B(){
		super(); //생략시 컴파일러가 자동 추가 (부모클래스의 생성자 호출)
		System.out.println("B 생성자");
	}
}
class C {
	C(int a){
		System.out.println("C 생성자");
	}
}
class D extends C {
	/* 컴파일러가 자동으로 추가해주는 내용
	D(){         
		super(); 
	}            
	*/
	D(){
		super(3);
	}
}
public class SuperMethod_1 {

	public static void main(String[] args) {
		A aa = new A();// A 생성자	
		System.out.println(); 
	
		B bb = new B(); // A 생성자 -> B 생성자

	}

}
