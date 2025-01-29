package sec04_boundedtype.EX03_BoundedTypeOfInputArguments;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

class Goods<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}	
}

class Test {
	void method1(Goods<A> g) {} //case1
	void method2(Goods<?> g) {} //case2
	void method3(Goods<? extends B> g) {} //case3
	void method4(Goods<? super B> g) {} //case4
}

public class BoundedTypeOfInputArguments {
	public static void main(String[] args) {
		Test t = new Test();
		
		//#1. case1 (A 타입만 가능)
		t.method1(new Goods<A>());
//		t.method1(new Goods<B>());
//		t.method1(new Goods<C>());
//		t.method1(new Goods<D>());
		
		//#2. case2 (모든 타입 가능)
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//#3. case3 (B 클래스 혹은 B의 자식 클래스 타입 만 가능)
//		t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		//#4. case4 (B 클래스 혹은 B의 부모 클래스 타입 만 가능)
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());		
	}
}