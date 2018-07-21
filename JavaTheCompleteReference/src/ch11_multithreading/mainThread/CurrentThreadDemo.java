package ch11_multithreading.mainThread;

public class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();

		System.out.println("Current Thread : " + thread);

		// Change the name of the current thread
		thread.setName("Prakhar");
		System.out.println("After Name change : " + thread);

		try {
			for (int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread was interrupted");
		}

	}
}
