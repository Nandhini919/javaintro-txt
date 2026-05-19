package oops02;

class Parent{
	Parent(){
		System.out.println("Parent Constructor called");
		}
}
class Child extends Parent{
	Child(){
		System.out.println("Parent Constructor called");
		}

}
//Multiple markers at this line
//- Syntax error on token ",", { expected
//- Syntax error, insert "}" to complete Block
//class SubChild extends Child, Parent{
//	SubChild(){
//		System.out.println("Parent Constructor called");
//		}
//
//	
//}

class SubChild extends Child{
	SubChild(){
		System.out.println("Parent Constructor called");
		}

	
}

public class TestDemo02 {

	public static void main(String[] args) {
		System.out.println("Main!");
		
		SubChild s1 = new SubChild();

	}

}
