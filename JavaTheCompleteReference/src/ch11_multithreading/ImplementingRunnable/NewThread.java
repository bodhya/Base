package ch11_multithreading.ImplementingRunnable;

public class NewThread implements Runnable {

	Thread t;

	NewThread() {
		// Create a new, second thread and 
		// that thread should call the run() method on this object. 
		// Therefore pass 'this' here
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread: " + t);
		
		t.start(); // Start the thread execution at the run() method
	}

	// This is the entry point for the second thread.
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}

}
