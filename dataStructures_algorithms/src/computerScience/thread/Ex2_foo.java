package computerScience.thread; 

public class Ex2_foo implements Runnable{
	@Override
	public void run() {
		System.out.println("thread Id : " + Thread.currentThread().threadId());
		System.out.println("thread name : " + Thread.currentThread().getName());
		System.out.println("process Id : " + ProcessHandle.current().pid());	
	}	
}
