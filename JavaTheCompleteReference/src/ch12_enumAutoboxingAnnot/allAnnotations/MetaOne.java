package ch12_enumAutoboxingAnnot.allAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(str = "MetaOne", val = 1)
@WhatNot(description = "An annotation test class")
public class MetaOne {

	@What(str = "myMeth", val = 2)
	@WhatNot(description = "An annotation test method")
	public static void myMeth() {
		
		MetaOne ob = new MetaOne();

		try {
			// Get all annotations for the class MetaOne
			Annotation annos[] = ob.getClass().getAnnotations();
			
			// Display all annotations for the class MetaOne
			System.out.println("All annotations for the class MetaOne:");
			for (Annotation a : annos)
				System.out.println(a);
			
			System.out.println();
			
			// Get all annotations for the method myMeth
			annos = ob.getClass().getMethod("myMeth").getAnnotations();
			
			// Display all annotations for the method myMeth
			System.out.println("All annotations for the method myMeth:");
			for (Annotation a : annos)
				System.out.println(a);
		
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String args[]) {
		myMeth();
	}

}
