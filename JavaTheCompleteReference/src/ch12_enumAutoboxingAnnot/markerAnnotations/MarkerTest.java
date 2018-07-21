package ch12_enumAutoboxingAnnot.markerAnnotations;

import java.lang.reflect.Method;

public class MarkerTest {

	// Annotate a method using a marker.
	// Notice that no ( ) is needed as no members are present
	@MyMarker
	public static void myMeth() {
		MarkerTest ob = new MarkerTest();
		try {
			
			Method m = ob.getClass().getMethod("myMeth");
			
			// Determine if the annotation is present.
			if (m.isAnnotationPresent(MyMarker.class))
				System.out.println("MyMarker is present.");
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String[] args) {
		myMeth();
	}

}
