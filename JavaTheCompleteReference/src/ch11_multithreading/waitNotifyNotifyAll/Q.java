package ch11_multithreading.waitNotifyNotifyAll;

public class Q {
	int n;

	/*synchronized int get() {
		System.out.println("Got: " + n);
		return n;
	}

	synchronized void put(int n) {
		this.n = n;
		System.out.println("Put: " + n);
	}*/

	boolean valueSet = false;

	/*
	 * Inside get( ), wait( ) is called. This causes its execution to suspend until Producer notifies you that some data is ready. 
	 * When this happens, execution inside get( ) resumes. 
	 * After the data has been obtained, get( ) calls notify( ). This tells Producer that it is okay to put more data in the queue. 
	 */
	synchronized int get() {
		while (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		System.out.println("Got: " + n);
		valueSet = false;
		notify();
		return n;
	}

	/* 
	 * Inside put( ), wait( ) suspends execution until Consumer has removed the item from the queue. 
	 * When execution resumes, the next item of data is put in the queue, and notify( ) is called. This tells Consumer that it should now remove it.
	 */
	synchronized void put(int n) {
		while (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
	}
}
