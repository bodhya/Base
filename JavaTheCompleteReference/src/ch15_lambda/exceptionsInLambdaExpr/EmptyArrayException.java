package ch15_lambda.exceptionsInLambdaExpr;

public class EmptyArrayException extends Exception {
	public EmptyArrayException() {
		super("Array is Empty");
	}
}
