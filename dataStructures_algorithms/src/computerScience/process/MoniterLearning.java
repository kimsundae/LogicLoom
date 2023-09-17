package computerScience.process;

public class MoniterLearning<E> {
    private static final int BUFFER_SIZE = 5;
    private E[] buffer;
    private int count;
    private int in;
    private int out;

    public MoniterLearning() {
        count = 0;
        in = 0;
        out = 0;
        buffer = (E[]) new Object[BUFFER_SIZE];
    }

    /* 생산자가 호출하는 코드 */
    public synchronized void insert(E item) {
        while (count == BUFFER_SIZE) {
            try {
                wait();
            } catch (InterruptedException ie) {
                // InterruptedException 처리
                Thread.currentThread().interrupt();
            }
        }

        buffer[in] = item;
        in = (in + 1) % BUFFER_SIZE;
        count++;

        notify();
    }

    /* 소비자가 호출하는 코드 */
    public synchronized E remove() {
        E item;

        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException ie) {
                // InterruptedException 처리
                Thread.currentThread().interrupt();
            }
        }

        item = buffer[out];
        out = (out + 1) % BUFFER_SIZE;
        count--;

        notify();
        return item;
    }	
}
