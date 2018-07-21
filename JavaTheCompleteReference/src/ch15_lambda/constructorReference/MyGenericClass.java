package ch15_lambda.constructorReference;

public class MyGenericClass<T> {
	private T val;

	MyGenericClass(T v) {
		val = v;
	}

	// This is the default constructor.
	MyGenericClass() {
		val = null;
	}

	// ...
	T getVal() {
		return val;
	};
}
