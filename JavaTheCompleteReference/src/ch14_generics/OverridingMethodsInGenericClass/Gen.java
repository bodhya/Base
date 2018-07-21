package ch14_generics.OverridingMethodsInGenericClass;

public class Gen<T> {
	T ob;

	Gen(T o) {
		ob = o;
	}

	T getob() {
		System.out.print("Gen's getob(): ");
		return ob;
	}
}
