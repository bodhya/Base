package ch14_generics.genericMethods;

public class GenCons {
	private double val;

	// Even though GenCons is not a generic class, its constructor is generic.
	// GenCons( ) specifies a parameter of a generic type, which must be a subclass of Number
	<T extends Number> GenCons(T arg) {
		val = arg.doubleValue();
	}

	void showval() {
		System.out.println("val: " + val);
	}
}
