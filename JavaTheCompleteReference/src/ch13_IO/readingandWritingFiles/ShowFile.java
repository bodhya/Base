package ch13_IO.readingandWritingFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

	public static void main(String[] args) {
		int i;
		FileInputStream fin;

		if (args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}

		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException f) {
			System.out.println("Cannot Open that File!");
			return;
		}

		// At this point, the file is open and can be read.
		// The following reads characters until EOF is encountered.
		try {
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("Error Reading File");
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				System.out.println("Error Closing File");
			}
		}

		// Alternative#1
		// The following code opens a file, reads characters until EOF
		// is encountered, and then closes the file via a finally block.
		/*try {
			fin = new FileInputStream(args[0]);
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
		} catch (IOException e) {
			System.out.println("An I/O Error Occurred");
		} finally {
			// Close file in all cases.
			try {
				if (fin != null)
					fin.close();
			} catch (IOException e) {
				System.out.println("Error Closing File");
			}
		}*/

		// Alternative#2
		// Alternatively, removing FileNotFoundException
		/*try {
			fin = new FileInputStream(args[0]);
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("An I/O Error Occurred");
		} finally {
			// Close file in all cases.
			try {
				if (fin != null)
					fin.close();
			} catch (IOException e) {
				System.out.println("Error Closing File");
			}
		}*/

	}
}
