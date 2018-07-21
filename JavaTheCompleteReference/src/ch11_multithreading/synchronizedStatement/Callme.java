package ch11_multithreading.synchronizedStatement;

public class Callme {
	
	void call(String msg) {
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
