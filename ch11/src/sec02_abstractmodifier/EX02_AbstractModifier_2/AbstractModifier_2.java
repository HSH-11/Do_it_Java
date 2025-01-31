package sec02_abstractmodifier.EX02_AbstractModifier_2;

/*추상클래스를 상속하여 오버라이딩 수행*/
//반드시 자식 클래스에서 오버라이딩 수행
abstract class Animal {
	abstract void cry();
}
class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}

public class AbstractModifier_2 {
	public static void main(String[] args) {
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry(); //야옹
		animal2.cry(); //멍멍
	}
}