package ch13_IO.staticImports;

//Use static import to bring sqrt() and pow() into view.
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class HypotenuseStaticImports {

	public static void main(String[] args) {

		double side1, side2;
		double hypot;

		side1 = 3.0;
		side2 = 4.0;

		// Notice how sqrt() and pow() must be qualified by
		// their class name, which is Math.
		hypot = sqrt(pow(side1, 2) + pow(side2, 2));

		System.out.println("Given sides of lengths " + side1 + " and " + side2 + " the hypotenuse is " + hypot);
	}

}
