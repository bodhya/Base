package ch12_enumAutoboxingAnnot.singleMemberAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//A single-member annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
	int value(); // this variable name must be value
	
	/*
	 * If other members are present, they must all have default values
	 */
	int xyz() default 0;
}
