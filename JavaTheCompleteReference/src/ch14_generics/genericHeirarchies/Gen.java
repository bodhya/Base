package ch14_generics.genericHeirarchies;

public class Gen<T> {
	T ob; 
	
	Gen(T o) {
		ob = o;
	}

	T getob() {
		return ob;
	}
}