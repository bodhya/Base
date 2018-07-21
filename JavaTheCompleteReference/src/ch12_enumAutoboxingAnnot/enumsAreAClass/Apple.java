package ch12_enumAutoboxingAnnot.enumsAreAClass;

public enum Apple {
	// The arguments to the constructor are specified in brackets
	// RedDel is not given a price - so it should use the default constructor
	Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8); 

	// instance variable price
	private int price;

	// Default constructor
	Apple() {
		price = -1;
	}

	// Apple Constructor
	Apple(int p) {
		price = p;
	}

	// method getPrice
	int getPrice() {
		return price;
	}
}
