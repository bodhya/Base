package ch15_lambda.constructorReferenceExample;

/*
 * A simple generic class
 */
public class MyClass<T> {
	private T val;

	// A constructor that takes an argument.
	MyClass(T v) {
		val = v;
	}

	// The default constructor. This constructor
	// is NOT used by this program.
	MyClass() {
		val = null;
	}

	// ...
	T getVal() {
		return val;
	};
}
