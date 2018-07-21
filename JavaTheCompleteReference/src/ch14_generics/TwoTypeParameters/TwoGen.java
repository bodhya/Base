package ch14_generics.TwoTypeParameters;

public class TwoGen<T, V> {

	T obj1;
	V obj2;

	public TwoGen(T o1, V o2) {
		obj1 = o1;
		obj2 = o2;
	}
	
	public void showTypes() {
		System.out.println("Type of T is : " + obj1.getClass().getName());
		System.out.println("Type of V is : " + obj2.getClass().getName());
	}

	public T getObj1() {
		return obj1;
	}

	public V getObj2() {
		return obj2;
	}
	
	
	
}
