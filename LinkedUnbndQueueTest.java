package Queues;

public class LinkedUnbndQueueTest {

	public static void main(String [] args){
		
		LinkedUnbndQueue<Integer> q = new LinkedUnbndQueue<Integer>();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
	
		System.out.println(q.toString());//5.32
		
		System.out.println(q.front());// 5.31b
		
		
	}
}
