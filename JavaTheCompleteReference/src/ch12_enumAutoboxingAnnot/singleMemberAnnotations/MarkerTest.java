package ch12_enumAutoboxingAnnot.singleMemberAnnotations;

import java.lang.reflect.Method;

public class MarkerTest {

	// Annotate a method using a marker.
	// Notice that no ( ) is needed as no members are present
	@MyMarker(20)
	public static void myMeth() {
		MarkerTest ob = new MarkerTest();
		try {

			Method m = ob.getClass().getMethod("myMeth");
			MyMarker mark = m.getAnnotation(MyMarker.class);
			System.out.println(mark.value());
			
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String[] args) {
		myMeth();
	}

}
