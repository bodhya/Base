package ch8_inheritance.methodOverriding;

public class Areas {

	public static void main(String[] args) {

		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		
		/*
		 * When an overridden method is called through a superclass reference, 
		 * then Java resolves which version to execute based upon 
		 * the type of object being referred to at the time the call occurs.
		 */
		Figure figref;	// Superclass reference
		figref = f;
		System.out.println("Area is " + figref.area());
		figref = r;
		System.out.println("Area is " + figref.area());
		figref = t;
		System.out.println("Area is " + figref.area());
		
	}

}
