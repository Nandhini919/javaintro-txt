package oops02;

//Multilevel Inheritance Example
class Person {
 String name;

 Person(String name) {
     this.name = name;
 }

 void showPerson() {
     System.out.println("Name: " + name);
 }
}

class Teacher extends Person {
 String subject;

 Teacher(String name, String subject) {
     super(name); // call Person constructor
     this.subject = subject;
 }

 void showTeacher() {
     System.out.println("Subject: " + subject);
 }
}

class MathTeacher extends Teacher {
 int experience;

 MathTeacher(String name, String subject, int experience) {
     super(name, subject); // call Teacher constructor
     this.experience = experience;
 }

 void showMathTeacher() {
     System.out.println("Experience: " + experience + " years");
 }
}

public class MultiLevelInheritance {
 public static void main(String[] args) {
     MathTeacher mt = new MathTeacher("Alice", "Mathematics", 10);

     // Display all details
     mt.showPerson();
     mt.showTeacher();
     mt.showMathTeacher();
 }
}