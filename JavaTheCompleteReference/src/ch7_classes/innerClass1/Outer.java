package ch7_classes.innerClass1;

public class Outer {

	int outer_x = 100;

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	/*
	 * Outer class has no knowledge of members of the inner class
	 */
	// void showy() {
	// System.out.println(y); // error, y not known here!
	// }

	// this is an inner class
	class Inner {

		int y = 10; // y is local to Inner

		void display() {
			System.out.println("display: outer_x = " + outer_x);
		}
	}

	void innerClassInAForLoop() {
		
		for (int i = 0; i < 10; i++) {
			
			class InnerNew {
				void display() {
					System.out.println("display: outer_x = " + outer_x);
				}
			}
			
			InnerNew inner = new InnerNew();
			inner.display();
		}
	}
}
