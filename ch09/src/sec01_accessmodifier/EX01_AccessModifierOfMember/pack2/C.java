package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class C {
	public void print() { //a, b, c, d
		//#객체생성 
		A a = new A(); //객체생성 가능
		
		//#멤버 활용
		System.out.print(a.a+ " "); //가능
		//System.out.print(a.b+ " "); //불가능
		//System.out.print(a.c+ " "); //불가능
		//System.out.print(a.d); //불가능
		System.out.println();
	}
}
