package computerScience.thread;

public class Ex1_foo extends Thread{
	
	@Override
	public void run() {
		System.out.println("thread Id : " + Thread.currentThread().threadId());
		System.out.println("thread name : " + Thread.currentThread().getName());
		System.out.println("process Id : " + ProcessHandle.current().pid());
	}
}
