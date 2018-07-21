package ch12_enumAutoboxingAnnot.annotations;

import java.lang.reflect.Method;

public class Meta {

	// Annotate a method.
	@CustomAnnotation(str = "Annotation Example", val = 100)
	public static void myMeth() {
		Meta ob = new Meta();
		// Obtain the annotation for this method
		// and display the values of the members.
		try {
			// First, get a Class object that represents
			// this class.
			Class<?> cl = ob.getClass();

			// Now, get a Method object that represents
			// this method.
			Method m = cl.getMethod("myMeth");

			// Next, get the annotation for this class.
			CustomAnnotation anno = m.getAnnotation(CustomAnnotation.class);

			// Finally, display the values.
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	// myMeth now has two arguments.
	@CustomAnnotation(str = "Two Parameters", val = 19)
	public static void myMeth(String str, int i) {
		Meta ob = new Meta();
		try {
			Class<?> c = ob.getClass();
			// Here, the parameter types are specified.
			
			Method m = c.getMethod("myMeth", String.class, int.class);
			
			CustomAnnotation anno = m.getAnnotation(CustomAnnotation.class);
			
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String[] args) {
		myMeth();
		myMeth("Tester", 20);
	}

}
