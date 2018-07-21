package ch13_IO.readingandWritingFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileTryWithResources {

	public static void main(String args[]) {
		int i;

		if (args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}

		// Alternatively, Using try-with-resources starting JDK 7
		try (FileInputStream fin = new FileInputStream(args[0])) {
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
		} catch (IOException e) {
			System.out.println("An I/O Error Occurred");
		}

	}

}
