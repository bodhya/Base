package ch12_enumAutoboxingAnnot.autoboxingInMethods;

public class AutoBoxing {
	
	// Take an Integer parameter and return an int value;
	static int unboxer(Integer v) {
		return v; // auto-unbox to int - simply by returning
	}

	public static void main(String args[]) {
		//Here, the int argument 100 is autoboxed into an Integer for the method call. 
		//The returned int value from unboxer() is also autoboxed into the Integer iOb.
		Integer iOb = unboxer(100);

		//Printing the wrapper object implicitly calls its toString() method and prints the enclosed value
		System.out.println(iOb);
	}
}
