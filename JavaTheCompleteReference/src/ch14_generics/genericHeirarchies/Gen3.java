package ch14_generics.genericHeirarchies;

public class Gen3<T, V> extends Gen<T> {
	V obj;

	public Gen3(T o1, V o2) {
		super(o1);
		obj = o2;
	}

	V getob2() {
		return obj;
	}
}
