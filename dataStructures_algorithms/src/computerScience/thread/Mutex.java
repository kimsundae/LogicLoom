package computerScience.thread;

import java.util.concurrent.locks.ReentrantLock;

public class Mutex {
	private static final int NUM_THREADS = 4;
	private static int shared = 0;
	private static final ReentrantLock mutex = new ReentrantLock();

	public static void main(String[] args) {
		Thread[] threads = new Thread[NUM_THREADS];

		for (int i = 0; i < NUM_THREADS; ++i) {
			threads[i] = new Thread(Mutex::foo);
			threads[i].start();
		}

		for (int i = 0; i < NUM_THREADS; ++i) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("final result is " + shared);
	}

	private static void foo() {
		for (int i = 0; i < 10000; ++i) {
			mutex.lock();
			try {
				shared += 1;
			} finally {
				mutex.unlock();
			}
		}
	}
}
