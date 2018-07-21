package ch14_generics.genericMethods;

public class GenConsDemo {

	public static void main(String[] args) {
		GenCons test = new GenCons(100);
		GenCons test2 = new GenCons(123.5F);
		test.showval();
		test2.showval();
		
//		GenCons test3 = new GenCons("Prakhar");

	}

}
