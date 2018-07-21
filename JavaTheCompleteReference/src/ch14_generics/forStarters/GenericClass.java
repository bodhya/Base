package ch14_generics.forStarters;

public class GenericClass<T> {

	/*
	 * T is a placeholder for the actual type that will be specified when a
	 * GenericClass object is created. Thus, obj will be an object of the type
	 * passed to T
	 */
	T obj;

	public GenericClass(T obj) {
		this.obj = obj;
	}

	/*
	 * The type parameter T can also be used to specify the return type of a method
	 */
	public T getObj() {
		return obj;
	}

	public void showMyType() {
		System.out.println("Type of T is " + obj.getClass().getName());
	}
}
