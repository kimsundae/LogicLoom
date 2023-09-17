package computerScience.process;

import java.util.concurrent.Semaphore;

public class SemaphoreLearning {
	static int num = 0;
    static Semaphore sem = new Semaphore(1);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                foo(sem);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                foo(sem);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(num);
    }

    public static void foo(Semaphore sem) throws InterruptedException {
        sem.acquire();
        for (int i = 0; i < 100000; i++) {
            num++;
        }
        sem.release();
    }
}
