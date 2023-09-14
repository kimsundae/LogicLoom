package computerScience.thread;

import java.util.LinkedList;
import java.util.Queue;

public class Producer_consumer {
	
		static int sum = 0;
		
	    public static void main(String[] args) {	        
	        System.out.println("초기 합계: " + sum);

	        Thread producer = new Thread(() -> produce());
	        Thread consumer = new Thread(() -> consume());

	        producer.start();
	        consumer.start();

	        try {
	            producer.join();
	            consumer.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("producer, consumer 스레드 실행 이후 합계: " + sum);
	    }
	    public static void produce() {
	        for (int i = 0; i < 100000; i++) {
	            sum++;
	        }
	    }

	    public static void consume() {
	        for (int i = 0; i < 100000; i++) {
	            sum--;
	        }
	    }
}


/*
https://github.com/kangtegong/self-learning-cs/blob/main/producer_consumer/producer_consumer.md
https://github.com/kangtegong/self-learning-cs/blob/main/producer_consumer/producer_consumer.cpp
	
	#include <iostream>
	 
	#include <queue>
	#include <thread>
	
	void produce();
	void consume();
	
	//std::queue<int> q;
	int sum = 0;
	
	int main() {
	
	    std::cout << "초기 합계: " <<  sum << std::endl;
	    std::thread producer(produce);
	    std::thread consumer(consume);
	
	    producer.join();
	    consumer.join();
	    
	    std::cout << "producer, consumer 스레드 실행 이후 합계: " <<  sum << std::endl;
	    
	    return 0;
	}
	
	void produce() {
	    for(int i = 0; i < 100000; i++) {
	        // q.push(1);
	        sum++;
	    }
	}
	
	void consume() {
	    for(int i = 0; i < 100000; i++) {
	        // q.pop();
	        sum--;
	    }
	}
*/