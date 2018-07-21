package ch15_lambda.methodReferenceExample;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodRef {

	// A method compatible with the one defined by Comparator<T>.
	// There is no need to explicitly implement and create an instance of Comparator.
	static int comparify(MyClass a, MyClass b) {
		return a.getVal() - b.getVal();
	}

	public static void main(String[] args) {
		
		ArrayList<MyClass> al = new ArrayList<MyClass>();
		al.add(new MyClass(1));
		al.add(new MyClass(4));
		al.add(new MyClass(2));
		al.add(new MyClass(9));
		al.add(new MyClass(3));
		al.add(new MyClass(7));
		
		// Find the maximum value in al using the comparify() method.
		MyClass maxValObj = Collections.max(al, UseMethodRef::comparify);
		System.out.println("Maximum value is: " + maxValObj.getVal());
	}

}
