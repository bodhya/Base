package ch13_IO.readingConsoleInput;

import java.io.PrintWriter;

public class UsingPrintWriter {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		
		pw.println("This is a test string");
		
		int i = -7;
		pw.println(i);
		
		double d = 4.5e-7;
		pw.println(d);
		
	}

}
