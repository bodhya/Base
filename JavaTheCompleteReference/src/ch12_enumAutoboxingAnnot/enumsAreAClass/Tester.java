package ch12_enumAutoboxingAnnot.enumsAreAClass;

public class Tester {

	public static void main(String[] args) {

		Apple ap;	//This causes the constructor in Apple to be called once for each enum constant defined.	

		// Display price of Winesap. Each enum constant has its own copy of the instance variable price. 
		System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents.\n");

		System.out.println("RedDel costs " + Apple.RedDel.getPrice() + " cents.\n");

		// Display all apples and prices.
		System.out.println("All apple prices:");
		for (Apple a : Apple.values())
			System.out.println(a + " costs " + a.getPrice() + " cents.");
	}

}
