package ch15_lambda.withOneParameter;

public class LambdaDemo {

	public static void main(String[] args) {
		
		// A lambda expression that tests if a number is even.
		NumericTest isEven = (n) -> (n % 2) == 0;
		
		if (isEven.test(10))
			System.out.println("10 is even");
		if (!isEven.test(9))
			System.out.println("9 is not even");
		
		// Now, use a lambda expression that tests if a number
		// is non-negative.
		NumericTest isNonNeg = (n) -> n >= 0;
		
		if (isNonNeg.test(1))
			System.out.println("1 is non-negative");
		if (!isNonNeg.test(-1))
			System.out.println("-1 is negative");
		
//		This lambda expr is not compatible with the abstract method of the func interface.
//		NumericTest isOK = (double n) -> n >= 0;
		
//		When a lambda expr has only one parameter specified on the LHS, 
//		it is not necessary to enclose it within (). Hence:
		NumericTest isEven2 = n -> (n % 2) == 0;

	}
}
