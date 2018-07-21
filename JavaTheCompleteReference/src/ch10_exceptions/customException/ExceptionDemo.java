package ch10_exceptions.customException;

public class ExceptionDemo {

	static void compute(int a) throws CustExcep {
		System.out.println("Called compute(" + a + ")");
		
		if (a > 10)
			throw new CustExcep(a);
		
		System.out.println("Normal exit");
	}

	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);
		} catch (CustExcep e) {
			System.out.println("Caught " + e);
		}

	}

}
