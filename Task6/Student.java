/**
* Write a program to print the names of students by creating a Student class. 
* If no name is passed while creating an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class. (Hint: Overloading concept) 
*/
package com.UC.program;

public class Student {

	String name;

	Student(String name) {
		System.out.println(name);
	}

	Student() {
		System.out.println("Unknown");
	}

	public static void main(String args[]) {

		Student s1 = new Student("Robert");
		Student s2 = new Student("Sam");
		Student s3 = new Student();
		Student s4 = new Student("Kenny");
		Student s5 = new Student();
	}
}
