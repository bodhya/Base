package ch14_generics.genericHeirarchies;

public class GenericSubclass<T> extends NonGeneric {
	T ob;

	GenericSubclass(T o, int i) {
		super(i);
		ob = o;
	}

	T getob() {
		return ob;
	}
}
