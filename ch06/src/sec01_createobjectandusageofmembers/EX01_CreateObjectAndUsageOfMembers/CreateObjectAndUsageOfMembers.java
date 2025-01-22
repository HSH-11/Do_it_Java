package sec01_createobjectandusageofmembers.EX01_CreateObjectAndUsageOfMembers;

class A {
	int m = 3;

	void print() {
		System.out.println("객체 생성 및 활용");
	}
}

public class CreateObjectAndUsageOfMembers {

	public static void main(String[] args) {
		A a = new A();

		// #3. 클래스 멤버 활용
		// @ 필드활용:필드에 값을 읽기/쓰기
		a.m = 5;
		System.out.println(a.m); // 5

		// @메서드를 활용: 메서드를 호출
		a.print(); // 객체 생성 및 활용

	}

}
