package ch11_multithreading.waitNotifyNotifyAll;

public class ProducerConsumer {
	public static void main(String[] args) {
		
		Q q = new Q();
		
		new Producer(q);
		new Consumer(q);
		
		System.out.println("Press Control-C to stop.");
		
		/*
		 * Although the put( ) and get( ) methods on Q are synchronized, 
		 * nothing stops the producer from overrunning the consumer, 
		 * nor will anything stop the consumer from consuming the same queue value twice
		 */
	}
}
