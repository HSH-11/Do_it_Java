package sec02_genericclass.EX01_SingleGenericArgument;
//제네릭 타입 변수 1개를 가진 제네릭 클래스의 선언 및 활용
class MyClass<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}	
}

public class SingleGenericArgument {
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();//기존 클래스 명 뒤에 제네릭 타입 선언
		mc1.set("안녕");
		System.out.println(mc1.get());
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.set(100);
		System.out.println(mc2.get());
//		MyClass<Integer> mc3 = new MyClass<>();
//		mc3.set("안녕"); //오류 강한타입체크
	}
}