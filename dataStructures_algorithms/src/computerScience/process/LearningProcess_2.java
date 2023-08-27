package computerScience.process;

import java.io.IOException;

public class LearningProcess_2 {
	public static void main(String[] args)  throws IOException{
		/*
		 *  ProcessHandle.current().pid() -> 프로세스의 PID값 확인 메소드
		 *  ProcessHandle.current()는 현재 실행 중인 프로세스의 객체를 얻음.
		 */
		System.out.println("parent process : " + ProcessHandle.current().pid());
		
		/*
		 *  ProcessBuilder는 자바에서 외부 프로세스를 실행하고 관리하는데 사용하는 유틸리티 클래스.
		 *  ProcessBuilder를 사용하여 자식 프로세스를 생성하기
		 */
		ProcessBuilder processBuilder = new ProcessBuilder("java" , "ChildProcess");
		Process childProcess = processBuilder.start();
		try {	
			childProcess.waitFor();
		}catch(Exception e) {e.printStackTrace();}
		
	}
	
}
class ChildProcess{
	public static void main(String[] args) {
		System.out.println("child process" + ProcessHandle.current().pid());
		System.out.println("my parent is " + ProcessHandle.current().parent().orElseThrow());
		while(true) {
			System.out.println("실행");
		}
	}
}
