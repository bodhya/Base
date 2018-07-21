package ch15_lambda.constructorReference;

public class MyClass {
	private int val;

	// This constructor takes an argument.
	MyClass(int v) {
		val = v;
	}

	// This is the default constructor.
	MyClass() {
		val = 0;
	}

	// ...
	int getVal() {
		return val;
	};
}
