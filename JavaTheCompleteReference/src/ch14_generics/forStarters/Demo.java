package ch14_generics.forStarters;

public class Demo {

	public static void main(String[] args) {
		
		// Create a GenericClass reference for Integers.
		GenericClass<Integer> intOb;
		
		// Notice the use of autoboxing to encapsulate the value 88 within an Integer object.
		intOb = new GenericClass<Integer>(88);
		
		// Show the type of data used by intOb.
		intOb.showMyType();
		
		// Get the value in intOb. Notice that no cast is needed.
		int v = intOb.getObj();
		System.out.println("value: " + v);
		
		
		System.out.println();
		
		// Create a GenericClass object for Strings.
		GenericClass<String> strOb = new GenericClass<String>("Generics Test");

		// Show the type of data used by strOb.
		strOb.showMyType();
		
		// Get the value of strOb. Again, notice that no cast is needed.
		String str = strOb.getObj();
		System.out.println("value: " + str);
	}

}
