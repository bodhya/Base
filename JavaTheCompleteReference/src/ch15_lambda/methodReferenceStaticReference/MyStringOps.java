package ch15_lambda.methodReferenceStaticReference;

public class MyStringOps {
	
	//static method
	static String strReverse(String str) {
		String result = "";
		
		int i;
		for (i = str.length() - 1; i >= 0; i--)
			result += str.charAt(i);
		
		return result;
	}
	
	//instance method
	String strReverse1(String str) {
		String result = "";
		
		int i;
		for (i = str.length() - 1; i >= 0; i--)
			result += str.charAt(i);
		
		return result;
	}
}
