package ch15_lambda.methodReferencesWithGenerics;

public class GenericMethodReferenceDemo {

	static <T> int myOp(MyFunc<T> genClassRef, T[] values, T value) {
		return genClassRef.func(values, value);
	}

	public static void main(String[] args) {
		
		Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
		String[] strs = { "One", "Two", "Three", "Two" };
		
		int count;
		
		count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
		System.out.println("vals contains " + count + " 4s");
		
		count = myOp(MyArrayOps::<String>countMatching, strs, "Two");
		System.out.println("strs contains " + count + " Twos");
	}

}
