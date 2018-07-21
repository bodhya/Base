package ch14_generics.rawTypes;

public class RawDemo {

	public static void main(String[] args) {

		Gen<Integer> iOb = new Gen<Integer>(88);
		Gen<String> strOb = new Gen<String>("Generics Test");
		
		// Create a raw-type Gen object and give it a Double value.
		Gen raw = new Gen(new Double(98.6));	// In essence, this creates a Gen object whose type T is replaced by Object.
		double d = (Double) raw.getob();	// Cast here is necessary because type is unknown.
		System.out.println("value: " + d);
		
		
		// A raw type is not type safe. 
		int i = (Integer) raw.getob(); // raw contains a double value - but this cannot be known at compile time, because the type of raw is unknown.
		
		// Assignment of a raw reference to a generic reference. Bypasses type-safety.
		// Here strObj is of type Gen<String>, it is assumed to contain a String. However, it is assigned raw, which contains a Double.
		strOb = raw;
		String str = strOb.getob(); // run-time error
		
		// Assignment of a generic reference to a raw reference variable.
		// Here. raw now refers to an object that contains an Integer object. But this cannot be known at compile time.
		raw = iOb; 
		d = (Double) raw.getob(); // run-time error
	}

}
