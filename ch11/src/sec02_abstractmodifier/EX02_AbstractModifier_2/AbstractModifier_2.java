package sec02_abstractmodifier.EX02_AbstractModifier_2;

/*�߻�Ŭ������ ����Ͽ� �������̵� ����*/

abstract class Animal {
	abstract void cry();
}
class Cat extends Animal {
	void cry() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal {
	void cry() {
		System.out.println("�۸�");
	}
}

public class AbstractModifier_2 {
	public static void main(String[] args) {
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry(); //�߿�
		animal2.cry(); //�۸�
	}
}