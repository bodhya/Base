package ch15_lambda.withTwoParameters;

public class LambdaDemo {

	public static void main(String[] args) {
		// This lambda expression determines if one number is a factor of another.
		NumericTest2 isFactor = (n, d) -> (n % d) == 0;
		
		if (isFactor.test(10, 2))
			System.out.println("2 is a factor of 10");
		if (!isFactor.test(10, 3))
			System.out.println("3 is not a factor of 10");

		/*
		 * In multiple parameter lambdas, if the type of one parameter is explicitly specified, 
		 * then it is mandatory to explicitly specify the type of all parameters.
		 */
		NumericTest2 isFactor1 = (int n, int d) -> (n % d) == 0;	//This is valid
//		NumericTest2 isFactor2 = (int n, d) -> (n % d) == 0;	//This is not!

	}
}
