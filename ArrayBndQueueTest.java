package Queues;

public class ArrayBndQueueTest {

	
	public static void main(String [] args){
		
		ArrayBndQueue<Integer> q = new ArrayBndQueue<Integer>(10);
		// filling the queue
		for(int i = 0; i < 10; i++){
			q.enqueue(i);
			
		}
		
		System.out.println(q.toString());// 5.14a
		
		q.dequeue();
		q.enqueue(15);
	
		
		System.out.println(q.toString());
	}
	
	
}
