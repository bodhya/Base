package ch14_generics.genericInterfaces;

/*
 * Because MinMax requires a type that implements Comparable, 
 * the implementing class (MyClass in this case) must specify the same bound. 
 * 
 * Furthermore, once this bound has been established, 
 * there is no need to specify it again in the implements clause.
 */
public class MyClass<T extends Comparable<T>> implements MinMax<T> {

	T[] vals;

	public MyClass(T[] obj) {
		vals = obj;
	}

	@Override
	public T min() {
		T v = vals[0];

		for (int i = 1; i < vals.length; i++)
			if (vals[i].compareTo(v) < 0)
				v = vals[i];

		return v;
	}

	@Override
	public T max() {
		T v = vals[0];

		for (int i = 1; i < vals.length; i++)
			if (vals[i].compareTo(v) > 0)
				v = vals[i];

		return v;
	}

}
