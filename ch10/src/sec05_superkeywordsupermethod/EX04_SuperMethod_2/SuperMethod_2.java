package sec05_superkeywordsupermethod.EX04_SuperMethod_2;
/*this()五辞球人 super() 五辞球税 肇遂*/

class A{
	A(){
		this(3);
		System.out.println("A 持失切 1");
	}
	A(int a){
		System.out.println("A 持失切 2");
	}
}
class B extends A{	
	B(){
		//super()
		this(3);
		System.out.println("B 持失切 1");
	}
	B(int a){
		//super()
		System.out.println("B 持失切 2");
	}
}
public class SuperMethod_2 {

	public static void main(String[] args) {
		
		A aa1 = new A(); // A 持失切 2 A 持失切 1
		System.out.println();
		A aa2 = new A(3); // A 持失切 2
		System.out.println();

		
		B bb1 = new B(); // A 持失切 2 A 持失切 1 B 持失切 2 B 持失切 1
		System.out.println();
		B bb2 = new B(3);// A 持失切 2 A 持失切 1 B 持失切 2

	}

}
