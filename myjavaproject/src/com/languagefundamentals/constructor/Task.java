package com.languagefundamentals.constructor;
class GrandParent {
    void display() {
        System.out.println("I am GrandParent display() method");
    }
}

class Parent extends GrandParent {
    void display() {
        System.out.println("I am Parent display() method");
        super.display();
    }
}

class Child extends Parent {
    void display() {
        System.out.println("I am Child display() method");
        super.display();
    }
}


public class Task {
	public static void main(String[] args) {
		System.out.println("Main Started");
		System.out.println("******************");
		

        System.out.println(" Calling  GrandParent ");
        GrandParent gp = new GrandParent();
        gp.display();
        System.out.println("******************");

        System.out.println(" Calling  Parent ");
        Parent p = new Parent();
        p.display();
        System.out.println("******************");

        System.out.println("Calling Child ");
        Child c = new Child();
        c.display();
        System.out.println("******************");
    }
}


