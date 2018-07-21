package ch12_enumAutoboxingAnnot.autoboxingInExpressions;

public class AutoBoxing {

	public static void main(String[] args) {

		Integer iOb, iOb2;
		int i;
		iOb = 100;
		System.out.println("Original value of iOb: " + iOb);

		// The following automatically unboxes iOb,
		// performs the increment, and then reboxes
		// the result back into iOb.
		++iOb;
		System.out.println("After ++iOb: " + iOb);

		// Here, iOb is unboxed, the expression is
		// evaluated, and the result is reboxed and
		// assigned to iOb2.
		iOb2 = iOb + (iOb / 3);
		System.out.println("iOb2 after expression: " + iOb2);

		// The same expression is evaluated, but the
		// result is not reboxed.
		i = iOb + (iOb / 3);
		System.out.println("i after expression: " + i);

		
		
		// Integer numeric objects can be used to control a switch statement as:
		Integer iObNew = 2;
		switch (iObNew) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("error");
		}


		
		// Autoboxing Boolean and Char values
		Boolean b = true;

		// Below, b is auto-unboxed when used in a conditional expression, such as an
		// if.
		if (b)
			System.out.println("b is true");

		// Autobox/unbox a char.
		Character ch = 'x'; // box a char
		char ch2 = ch; // unbox a char
		System.out.println("ch2 is " + ch2);
	}
}
