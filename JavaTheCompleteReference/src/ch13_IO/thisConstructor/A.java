package ch13_IO.thisConstructor;

public class A {
	int a, b;

	A(int i, int j) {
		a = i;
		b = j;
	}

	
	
	A(int i) {
		a = b = i;
	}
	
	// Alternatively using this() :
	/*A(int i) {
		this(i, i);
	}*/

	
	
	A() {
		a = b = 0;
	}
	
	// Alternatively using this() :
	/*A() {
		this(0);
	}*/
	
	
	
}
