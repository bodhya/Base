package ch14_generics.genericInterfaces;

public class GenericInterfacesDemo {

	public static void main(String[] args) {
		
		Integer inums[] = { 3, 6, 2, 8, 6 };	
		MyClass<Integer> iob = new MyClass<Integer>(inums);
		System.out.println("Max value in inums: " + iob.max());
		System.out.println("Min value in inums: " + iob.min());

		System.out.println();
		
		Character chs[] = { 'b', 'r', 'p', 'w' };
		MyClass<Character> cob = new MyClass<Character>(chs);
		System.out.println("Max value in chs: " + cob.max());
		System.out.println("Min value in chs: " + cob.min());
	}

}
