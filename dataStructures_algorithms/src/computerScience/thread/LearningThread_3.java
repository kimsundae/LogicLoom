package computerScience.thread;

public class LearningThread_3 {

	public static void main(String[] args) {
		System.out.println("process id : " + ProcessHandle.current().pid());
		
		Ex3_foo thread1 = new Ex3_foo();
		thread1.start();
		Ex3_bar thread2 = new Ex3_bar();
		thread2.start();
		Ex3_baz thread3 = new Ex3_baz();
		thread3.start();
	}

}
