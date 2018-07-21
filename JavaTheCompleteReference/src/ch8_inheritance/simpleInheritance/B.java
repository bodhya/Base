package ch8_inheritance.simpleInheritance;

public class B extends A {

	int k;

	void showk() {
		System.out.println("k: " + k);
	}
	
	void sum() {
	    System.out.println("i+j+k: " + (i+j+k));
//	    System.out.println("trying to access a private member of the superclass be like: " + y );
	}

}
