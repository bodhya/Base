package ch14_generics.BoundedWildcards;

/*
 * This means that any array stored in a Coords object will contain 
 * objects of type TwoD or one of its subclasses.
 */
public class Coords<T extends TwoD> {
	T[] coords;

	public Coords(T[] obj) {
		coords = obj;
	}
}
