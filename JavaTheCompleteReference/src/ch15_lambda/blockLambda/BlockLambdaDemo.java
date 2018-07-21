package ch15_lambda.blockLambda;

public class BlockLambdaDemo {
	public static void main(String[] args) {
		
		NumFunc factorial = (n) -> {
			int result = 1;
			for (int i=1; i<=n; i++)
				result *= i;
			return result;
		};
		
		System.out.println("3 Factorial : " + factorial.func(3));
		System.out.println("5 Factorial : " + factorial.func(5));
		
		
		StrFunc stringReversal = (str) -> {
			String result = "";
			int i;
			for (i = str.length() - 1; i>=0; i--) 
				result += str.charAt(i);
			
			return result;
		};
		
		System.out.println("The reverse of 'Prakhar' is : " + stringReversal.func("Prakhar"));

		
		
		System.out.println();
		/*
		 * Generic Functional Interface usage
		 */
		GenericFunc<Integer> genFactorial = (n) -> {
			int result = 1;
			for (int i=1; i<=n; i++)
				result *= i;
			return result;
		};
		System.out.println("3 Factorial : " + genFactorial.func(2));
		System.out.println("5 Factorial : " + genFactorial.func(4));
		
		
		GenericFunc<String> genStringReversal = (str) -> {
			String result = "";
			int i;
			for (i = str.length() - 1; i>=0; i--) 
				result += str.charAt(i);
			
			return result;
		};
		
		System.out.println("The reverse of 'Prakhar' is : " + genStringReversal.func("Kumar"));

	}
}
