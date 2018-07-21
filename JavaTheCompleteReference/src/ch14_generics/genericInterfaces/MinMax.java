package ch14_generics.genericInterfaces;

public interface MinMax<T extends Comparable<T>> {
	T min();
	T max();
}
