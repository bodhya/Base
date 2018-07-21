package ch14_generics.genericMethods;

public class GenMethDemo {

	/*
	 * - The type parameters are declared before the return type of the method.
	 * 
	 * - T extends Comparable<T>. Comparable is an interface declared in java.lang.
	 * A class that implements Comparable defines objects that can be ordered. Thus,
	 * requiring an upper bound of Comparable ensures that isIn( ) can be used only
	 * with objects that are capable of being compared.
	 * 
	 * - The type V is upper-bounded by T. Thus, V must either be the same as type
	 * T, or a subclass of T. This relationship enforces that isIn( ) can be called
	 * only with arguments that are compatible with each other.
	 */
	// Determine if an object is in an array.
	static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
		for (int i = 0; i < y.length; i++)
			if (x.equals(y[i]))
				return true;
		return false;
	}

	public static void main(String[] args) {

		// Use isIn() on Integers.
		/*
		 * Notice how the method call does not need type arguments.
		 * So we can call the method like:
		 * 		if(isIn(2, nums))
		 * Instead of:
		 * 		GenMethDemo.<Integer, Integer>isIn(2, nums)
		 */
		Integer nums[] = { 1, 2, 3, 4, 5 };
		if (isIn(2, nums))
			System.out.println("2 is in nums");

		if (!isIn(7, nums))
			System.out.println("7 is not in nums");

		System.out.println();

		// Use isIn() on Strings.
		String strs[] = { "one", "two", "three", "four", "five" };
		if (isIn("two", strs))
			System.out.println("two is in strs");

		if (!isIn("seven", strs))
			System.out.println("seven is not in strs");

		// Oops! Won't compile! Types must be compatible.
		// if (isIn("two", nums))
		// System.out.println("two is in strs");
	}

}
