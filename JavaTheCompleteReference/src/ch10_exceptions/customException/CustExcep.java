package ch10_exceptions.customException;

public class CustExcep extends Exception {
	
	private int detail;
	
	CustExcep(int a) {
		detail = a;
	}
	
	@Override
	public String toString() {

		return "Custom Exception [ " + detail + " ]";
	}
}
