package sec02_abstractmodifier.EX02_AbstractModifier_2;

/*眠惑努贰胶甫 惑加窍咯 坷滚扼捞爹 荐青*/

abstract class Animal {
	abstract void cry();
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

public class AbstractModifier_2 {
	public static void main(String[] args) {
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry(); //具克
		animal2.cry(); //港港
	}
}