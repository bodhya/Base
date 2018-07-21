package ch11_multithreading.waitNotifyNotifyAll;

public class Consumer implements Runnable {

	Q q;

	Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		int i = 0;
		while (i<100 && true) {
			q.get();
			i++;
		}
	}

}
