package Queues;

public class PrintChar implements Runnable {// 5.39
	int a;
	char b;
	
	public PrintChar(int a, char b){
		this.a = a;
		this.b = b;
	}	
	public void run() {
		int g = 0;
		for(int i = 0; i < a; i++){
			System.out.print(b);		
			g++;
		}
		System.out.printf("\nPrinted %c %d times.\n",b, a);
	
	}

}
