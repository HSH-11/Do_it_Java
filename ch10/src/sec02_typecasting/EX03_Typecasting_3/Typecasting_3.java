package sec02_typecasting.EX03_Typecasting_3;

class A{}
class B extends A{}

public class Typecasting_3 {

	public static void main(String[] args) {
		//instanceof
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A); //true
		System.out.println(ab instanceof A); //true
		
		System.out.println(aa instanceof B); //false
		System.out.println(ab instanceof B); //true
		
		if(aa instanceof B) {
			B b = (B)aa;
			System.out.println("aa를 B로 캐스팅하였습니다.");
		} else {
			System.out.println("aa는 B 타입으로 캐스팅이 불가!!!");
		}			
		if(ab instanceof B) {
			B b = (B)ab;
			System.out.println("ab를 B로 캐스팅하였습니다.");
		} else {
			System.out.println("ab는 B 타입으로 캐스팅이 불가!!!");
		}		
		if ("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스입니다");
		}
		/*
		실행 결과
		aa는 B 타입으로 캐스팅이 불가!!!
		ab를 B로 캐스팅하였습니다.
		"안녕"은 String 클래스입니다
		*/
	}

}
