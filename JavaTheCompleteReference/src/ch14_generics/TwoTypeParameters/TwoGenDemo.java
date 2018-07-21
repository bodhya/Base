package ch14_generics.TwoTypeParameters;

public class TwoGenDemo {

	public static void main(String[] args) {

		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(91, "Prakhar");
		
		tgObj.showTypes();
		
		int v = tgObj.getObj1();
		System.out.println("value : " + v);
		
		String s = tgObj.getObj2();
		System.out.println("value : " + s);
	}

}
