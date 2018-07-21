package ch15_lambda.beginner;

public class Mine {

	public static void main(String[] args) {

		SampleNum sampleNum;
		
		/*
		 * Here, the lambda expression is simply a constant expression. 
		 * When it is assigned to myNum, a class instance is constructed 
		 * in which the lambda expression implements the getValue() method in MyNumber.
		 */
		sampleNum = () -> 123.45;
		
		System.out.println(sampleNum.getVal());
		
		
		
		sampleNum = () -> Math.random() * 100;
		System.out.println("A random value: " + sampleNum.getVal());
	    System.out.println("Another random value: " + sampleNum.getVal());
	    
	    
//	    A lambda expression must be compatible with the method
//	    defined by the functional interface. Therefore, this won't work:
//	    sampleNum = () -> "123.03"; // Error!
		
	}

}
