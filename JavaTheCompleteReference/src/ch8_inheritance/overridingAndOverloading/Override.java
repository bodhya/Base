package ch8_inheritance.overridingAndOverloading;

public class Override {

	public static void main(String[] args) {

		B subOb = new B(1, 2, 3);
        subOb.show(); // this calls the show() in B which overrides the show() in A
        subOb.show("This is k: "); // this calls the overloaded method show() in B
	}

}
