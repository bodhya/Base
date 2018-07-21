package ch8_inheritance.abstractClasses;

public class AbstractDemo {

	public static void main(String[] args) {

		B b = new B();
		b.callme();		//Calling B's implementation of the abstract method
		b.callmetoo();	// Calling concrete method defined in the abstract class
	}

}
