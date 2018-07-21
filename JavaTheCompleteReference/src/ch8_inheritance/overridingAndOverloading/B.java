package ch8_inheritance.overridingAndOverloading;

public class B extends A {
	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// display k – this overrides show() in A
	// void show() {
	// System.out.println("k: " + k);
	// }

	void show() {
		super.show(); // this calls A's show()
		System.out.println("k: " + k);
	}

	// overload show() (not overridden)
	void show(String msg) {
		System.out.println(msg + k);
	}
}