package ch11_multithreading.waitNotifyNotifyAll;

public class Producer implements Runnable {
	
	Q q;

	Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		int i = 0;
		while (i<100 && true) {
			q.put(i++);
		}
	}
}
