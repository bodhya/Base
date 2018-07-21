package ch14_generics.OverridingMethodsInGenericClass;

public class OverrideGenDemo {

	public static void main(String[] args) {
		Gen<Integer> iOb = new Gen<Integer>(88);
		Gen2<Integer> iOb2 = new Gen2<Integer>(99);
		Gen2<String> strOb2 = new Gen2<String>("Generics Test");

		System.out.println(iOb.getob());
		System.out.println(iOb2.getob());
		System.out.println(strOb2.getob());
	}

}
