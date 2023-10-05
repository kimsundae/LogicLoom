package computerScience.thread;

public class LearningThread_1 {

	public static void main(String[] args) {
		//System.out.println("process id: " + ProcessHandle.current().pid());
		// Thread클래스를 상속받은 Ex1_foo 클래스
        Ex1_foo thread = new Ex1_foo();
        thread.start();
    }
}
