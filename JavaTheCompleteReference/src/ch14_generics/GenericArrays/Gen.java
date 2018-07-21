package ch14_generics.GenericArrays;

public class Gen<T extends Number> {
	T ob;

	T vals[]; // OK. It’s valid to declare a reference to an array of type T

	Gen(T o, T[] nums) {
		ob = o;
		
		// vals = new T[10]; // But you can't create an array of T. 
		// Compiler does not know which type of array to create.
		
		// But, this statement is OK.
		vals = nums; // OK to assign reference to existent array. 
		//This is because the type of array passed during constructor call (in nums) will determine the type of object created, and so the compiler knows.
	}
}
