package ch11_multithreading.synchronizedMethods;

public class Callme {
	/*
	 * Also, there is nothing stopping a race condition. 
	 * Potentially all 3 threads could call the call method 
	 * on the same target object at the same time.
	 * TO fix that, access to the call() must be serialized (i.e. one thread at a time)
	 * That is done by the synchronized keyword
	 */
	synchronized void call(String msg) {
		System.out.print("[" + msg);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		//by calling sleep( ), the call( ) method allows execution 
		//to switch to another thread. This results in the mixed-up output 
		//of the three message strings.
		
		System.out.println("]");
	}
}
