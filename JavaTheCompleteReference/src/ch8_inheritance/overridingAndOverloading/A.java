package ch8_inheritance.overridingAndOverloading;

public class A {
	int i, j;

	A(int a, int b) {
		i = a;
		j = b;
	}

	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}
