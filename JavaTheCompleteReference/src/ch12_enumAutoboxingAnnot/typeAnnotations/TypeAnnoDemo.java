package ch12_enumAutoboxingAnnot.typeAnnotations;

/*
 * 	Annotation		Target
	@TypeAnno		ElementType.TYPE_USE
	@MaxLen			ElementType.TYPE_USE
	@NotZeroLen		ElementType.TYPE_USE
	@Unique			ElementType.TYPE_USE
	@What			ElementType.TYPE_PARAMETER
	@EmptyOK		ElementType.FIELD
	@Recommended	ElementType.METHOD
 */

//Use an annotation on a type parameter.
public class TypeAnnoDemo<@What(description = "Generic data type") T> {

	// Use a type annotation on a constructor.
	public @Unique TypeAnnoDemo() {
	}

	// Annotate the type (in this case String), not the field.
	@TypeAnno
	String str;

	// This annotates the field test.
	@EmptyOK
	String test;

	// Use a type annotation to annotate this (the receiver).
	public int func(@TypeAnno TypeAnnoDemo<T>this,int x) {
		return 10;
	}

	// Annotate the return type.
	public @TypeAnno Integer f2(int j, int k) {
		return j + k;
	}

	// Annotate the method declaration.
	public @Recommended Integer f3(String str) {
		return str.length() / 2;
	}

	// Use a type annotation with a throws clause.
	public void f4() throws @TypeAnno NullPointerException {
	}

	// Annotate array levels.
	String @MaxLen(10) [] @NotZeroLen [] w;

	// Annotate the array element type.
	@TypeAnno
	Integer[] vec;

	public static void myMeth(int i) {
		// Use a type annotation on a type argument.
		TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();

		// Use a type annotation with new.
		@Unique
		TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();

		Object x = new Integer(10);
		Integer y;
		// Use a type annotation on a cast.
		y = (@TypeAnno Integer) x;
	}

	public static void main(String args[]) {
		myMeth(10);
	}

	// Use type annotation with inheritance clause.
	class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {
	}
}
