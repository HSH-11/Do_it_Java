package sec02_abstractmodifier.EX01_AbstractModifier_1;

/*老馆努贰胶甫 惑加窍咯 坷滚扼捞爹 荐青*/

class Animal {
	void cry() {
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("具克");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("港港");
	}
}

public class AbstractModifier_1 {
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();

		animal1.cry(); // 具克
		animal2.cry(); // 港港
	}
}