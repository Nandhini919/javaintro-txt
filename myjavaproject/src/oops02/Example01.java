package oops02;



//Every class in java extends Object class, so we can consider this as Implicit SIngle Inheritance.
class TestDemoA {
	int a1 = 100;

	void methodA() {
		System.out.println("methodA called ");
	}
}

//SIngle Inheritance, By using Child Object, we can access both parent & child class functionalities
class TestDemoB extends TestDemoA {

	int b1 = 200;
	int a1 = 300;

	void methodB() {
		System.out.println("methodB called ");
		System.out.println(this.a1);
		System.out.println(super.a1);
	}

}

//One class cannot extends Multiple classes in java, So multiple inheritance is not possible in Java, 
//Due to Diamond problem.
//What is Diamond Problem..?

//class TestDemoC extends TestDemoB, TestDemoA { //Syntax error on tokens, delete these tokens

class TestDemoC extends TestDemoB {
	int c1 = 100;

	void methodC() {
		System.out.println("methodC called ");
	}
}

//Driver class 
public class Example01 {

	public static void main(String[] args) {

		TestDemoC t = new TestDemoC();
		System.out.println(t.a1);
		System.out.println(t.b1);
		System.out.println(t.c1);
		t.methodA();
		t.methodB();
		t.methodC();
		System.out.println(t.toString());

	}

}