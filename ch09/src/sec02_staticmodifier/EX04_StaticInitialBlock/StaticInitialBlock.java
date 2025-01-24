package sec02_staticmodifier.EX04_StaticInitialBlock;

class A {
	int a;
	static int b;
	static {//정적필드를 초기화하기 위한 문법:클래스가 메모리에 로드될 때 실행
		b = 5; // static 필드의 초기화는 static {} 내에서 수행
		System.out.println("클래스 A가 로딩되었습니다!!");
	}//정적 필드는 객체가 생성되기 전에서도 초기화가 가능해야함 

	A() {
		a = 3; // 인스턴스 필드 초기화는 생성자에서 일반적으로 수행
		// b=5; 생성자에서는 정적 필드를 초기화 할 수 없다
	}
}

public class StaticInitialBlock {
	public static void main(String[] args) {		
		System.out.println(A.b); //5		
	}
}
