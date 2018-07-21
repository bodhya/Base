package ch15_lambda.constructorReference;

public class ConstructorRefDemo {

	public static void main(String[] args) {
		
		// Because func() in MyFunc takes
		// an argument, new refers to the parameterized constructor in MyClass, not the
		// default constructor.
		
		// Create a reference to the MyClass constructor. 
		MyFunc myClassCons = MyClass::new;
		// Create an instance of MyClass via that constructor reference.
		MyClass mc = myClassCons.func(100);
		// Use the instance of MyClass just created.
		System.out.println("val in mc is " + mc.getVal());

		
		
		
		
		// Constructor Reference to a Generic Class

		// Create a reference to the MyGenericClass<T> constructor.
		MyGenericFunc<Integer> myGenericClassCons = MyGenericClass<Integer>::new;
		// Create an instance of MyGenericClass<T> via that constructor reference.
		MyGenericClass<Integer> mgc = myGenericClassCons.func(200);
		// Use the instance of MyGenericClass<T> just created.
		System.out.println("val in mgc is " + mgc.getVal());

	}
}
