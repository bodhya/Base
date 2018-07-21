package ch14_generics.genericHeirarchies;

public class HeirarchyDemo {

	public static void main(String[] args) {
		// Create a Gen3 object for String and Integer.
		Gen3<String, Integer> x = new Gen3<String, Integer>("Value is: ", 99);
		
		System.out.print(x.getob());
		System.out.println(x.getob2());
	}

}
