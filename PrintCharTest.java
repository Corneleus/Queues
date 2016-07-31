package Queues;

public class PrintCharTest {//5.39

	public static void main(String [] args)
		throws InterruptedException{
			Runnable r = new PrintChar(200 , 'A');
			Runnable rr = new PrintChar(200 , 'B');
			Thread t = new Thread(r);
			Thread tt = new Thread(rr);
			t.start();
			tt.start();
	}
				
}