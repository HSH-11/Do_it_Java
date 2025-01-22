package sec01_field.EX02_InitialValueOfFieldAndLocalVariable;
/*필드와 지역변수의 초기값*/
//#1 클래스 생성(정의)
class A {
	//필드는 강제 초기화
	boolean m1;
	int m2;
	double m3;
	String m4;	
	
	void printFieldValue () {
		System.out.println(m1); //false
		System.out.println(m2); //0
		System.out.println(m3); //0.0
		System.out.println(m4); //null: 객체를 가리키지 않고 있다.
	}	
	void printLocalVariable() {
		int k;	
		//System.out.println(k); //지역변수는 반드시 초기화하여야 함
	}
}
public class InitialValueOfFieldAndLocalVariable {

	public static void main(String[] args) {
		A a = new A();		
		
		a.printFieldValue();

	}

}
