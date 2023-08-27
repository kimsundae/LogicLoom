package computerScience.process;

public class LearningProcess_1 {

	public static void main(String[] args) {
		System.out.println("hello os");
		// ProcessHandle.current().pid() -> 프로세스의 PID값 확인 메소드
		System.out.println("my pid is : " + ProcessHandle.current().pid());
	}

}
