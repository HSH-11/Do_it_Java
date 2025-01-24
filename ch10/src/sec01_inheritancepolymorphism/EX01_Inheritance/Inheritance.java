package sec01_inheritancepolymorphism.EX01_Inheritance;

class Human {
	String name;
	int age;
	void eat() {}
	void sleep() {}
}
class Student extends Human {
	int studentID;
	void goToSchool() {}
}
class Worker extends Human {
	int workerID;
	void goToWork() {}
}
public class Inheritance {
	public static void main(String[] args) {
		//#1. Human 按眉 积己
		Human h = new Human();
		h.name = "辫泅瘤";
		h.age = 11;
		h.eat();
		h.sleep();
		
		//#2. Student 按眉 积己
		Student s = new Student();
		s.name = "辫刮己";
		s.age = 16;
		s.studentID =128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		//#3. Worker 按眉 积己
		Worker w = new Worker();
		w.name = "豪辣沥";
		w.age = 45;
		w.workerID = 128;
		w.eat();
		w.sleep();
		w.goToWork();
	}
}
