package sec02_method.EX06_MethodOverloading;

//Method Signature(메서드명,자료형,입력매개변수의 개수)

public class MethodOverloading {

	public static void main(String[] args) {
		print(); //No data
		print(3); //3
		print(5.8); //5.8
		print(2, 5);
	}
	public static void print() {
		System.out.println("No data");
	}	
	public static void print(int a) {
		System.out.println(a);
	}	
	public static void print(double a) {
		System.out.println(a);
	}
	/* 불가능 (void print(double a) {}와 중복)
	public static void print(double b) { //불가능
		System.out.println(b);
	}
	*/	
	public static void print(int a, int b) {
		System.out.println("a: "+ a + " b: "+b);
	}
	/* 불가능 (void print(int a, int b){}와 중복)
	public static int print(int a, int b) { //불가능
		System.out.println("a: "+ a + " b: "+b);
		return a+b;
	} 
	*/

}
