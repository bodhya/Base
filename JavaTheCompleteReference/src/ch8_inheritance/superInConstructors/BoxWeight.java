package ch8_inheritance.superInConstructors;

public class BoxWeight extends Box {

	double weight; // weight of box

	// constructor for BoxWeight (without the use of Super)
	// BoxWeight(double w, double h, double d, double m) {
	// width = w;
	// height = h;
	// depth = d;
	// weight = m;
	// }

	// constructors for BoxWeight (using Super)
	BoxWeight(double w, double h, double d, double m) {

		super(w, h, d);
		// The superclass Box can even make these members private.
		// Super keyword will allow subclasses to use the superclass constructor for
		// initializing objects
		weight = m;
	}

	BoxWeight(BoxWeight bw) {
		super(bw);	//A superclass reference can be used to reference any subclass reference
		weight = bw.weight;
	}

	BoxWeight() {
		super();
		weight = -1;
	}

	// constructor used when cube is created
	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}
