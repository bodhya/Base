package ch13_IO.readingandWritingFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileTryWithMultipleResources {
	public static void main(String[] args) {
		int i;
		// First, confirm that both files have been specified.
		if (args.length != 2) {
			System.out.println("Usage: CopyFile from to");
			return;
		}
		// Open and manage two files via the try statement.
		try (FileInputStream fin = new FileInputStream(args[0]); FileOutputStream fout = new FileOutputStream(args[1])) {
			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("I/O Error: " + e);
		}
	}

}
