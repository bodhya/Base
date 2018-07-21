package ch15_lambda.exceptionsInLambdaExpr;

public interface DoubleNumericArrayFunc {
	double func(double[] d) throws EmptyArrayException;
	// The param to this method is a String array, however, 
	// the parameter defined in the lambda expr is simply a variable n rather than n[]
	// This works because the type of n is determined from the type in the target context.
	// Hence it is neither necessary nor legal to define the type parameter as n[] in the lambda expression.
}
