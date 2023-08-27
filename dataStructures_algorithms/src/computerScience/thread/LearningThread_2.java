package computerScience.thread;

public class LearningThread_2 {
	public static void main(String[] args) {
		System.out.println("process id : " + ProcessHandle.current().pid());
		
		Thread thread1 = new Thread(new Ex2_foo());
		thread1.start();
		Thread thread2 = new Thread(new Ex2_foo());
		thread2.start();
		Thread thread3 = new Thread(new Ex2_foo());
		thread3.start();
		
	}
}
