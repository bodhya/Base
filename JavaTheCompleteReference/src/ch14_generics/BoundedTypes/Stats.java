package ch14_generics.BoundedTypes;

/*
 * Stats attempts (unsuccessfully) to create a generic class that can compute the average of an array of numbers of any given type
 */
public class Stats<T extends Number> {

	T[] nums; // nums is an array of type T

	// Pass the constructor a reference to
	// an array of type T.
	Stats(T[] o) {
		nums = o;
	}

	// Return type double in all cases.
	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i].doubleValue(); // Error if not used with Bounded Types!!! Because compiler does not know that you intend to use this method
											// only with numeric types, and not with String or what not.
		return sum / nums.length;
	}
	
	boolean sameAvg(Stats<?> obj) {
		if (average()==obj.average())
			return true;
		return false;
	}
	
}
