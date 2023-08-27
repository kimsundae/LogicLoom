package computerScience.thread;

public class Ex3_foo extends Thread{
	@Override
	public void run() {
		System.out.println("this is foo");
	}
}
class Ex3_bar extends Thread{
	@Override
	public void run() {
		System.out.println("this is bar");
	}
}
class Ex3_baz extends Thread{
	@Override
	public void run() {
		System.out.println("this is baz");
	}
}
