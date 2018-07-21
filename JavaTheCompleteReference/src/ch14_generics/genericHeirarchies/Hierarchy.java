package ch14_generics.genericHeirarchies;

public class Hierarchy {

	public static void main(String[] args) {
		GenericSubclass<String> w = new GenericSubclass<String>("Hello", 47);

		System.out.print(w.getob() + " ");
		System.out.println(w.getnum());

	}

}
