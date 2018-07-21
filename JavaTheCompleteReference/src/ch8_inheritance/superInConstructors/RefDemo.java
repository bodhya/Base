package ch8_inheritance.superInConstructors;

public class RefDemo {

	public static void main(String[] args) {

		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		
		double vol;
		vol = weightbox.volume();
		System.out.println("Volume of weightbox is " + vol);
		System.out.println("Weight of weightbox is " + weightbox.weight);
		System.out.println();
		
		
		Box plainbox = new Box();
		// assign BoxWeight reference to Box reference
		plainbox = weightbox;
		vol = plainbox.volume(); // OK, volume() defined in Box
		System.out.println("Volume of plainbox is " + vol);
		
		/*
		 * The following statement is invalid because plainbox does not define a weight
		 * member. When a subclass reference is assigned to a superclass reference variable, 
		 * that superclass reference can then only access the members 
		 * that are defined by the superclass.
		 */
		// System.out.println("Weight of plainbox is " + plainbox.weight);
	}

}
