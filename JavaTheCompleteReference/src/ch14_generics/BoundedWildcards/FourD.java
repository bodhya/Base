package ch14_generics.BoundedWildcards;

public class FourD extends ThreeD {
	int t;

	public FourD(int a, int b, int c, int d) {
		super(1, b, c);
		t = d;
	}
}
