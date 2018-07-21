package ch7_classes.objectsAsParameters;

public class Test {

	int a, b;
	
	public Test(int i, int j) {
		a = i;
		b = j;
	}
	
	boolean equalTo(Test obj) {
		//If this object passed in the parameter is equal to the invoking object, return true. Else false.
		if (a == obj.a && b == obj.b)
			return true;
		return false;
	}

}
