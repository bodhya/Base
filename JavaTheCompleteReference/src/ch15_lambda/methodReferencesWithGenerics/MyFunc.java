package ch15_lambda.methodReferencesWithGenerics;

public interface MyFunc<T> {
	int func(T[] values, T value);
}
