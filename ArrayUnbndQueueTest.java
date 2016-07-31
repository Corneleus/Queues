package Queues;
import java.util.*;
public class ArrayUnbndQueueTest {

	public static void main(String [] args){// 5.23
	
		ArrayUnbndQueue<String> male = new ArrayUnbndQueue<String>();
		ArrayUnbndQueue<String> female = new ArrayUnbndQueue<String>();
		
		/*male.enqueue("mark");
		male.enqueue("bob");
		male.enqueue("joe");
		female.enqueue("jean");
		female.enqueue("kelly");
		female.enqueue("laura");
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a gender and a name (x done to quit): ");
		String g = scan.nextLine();
		
		while(!g.equals("x done")){		
			
				if (g.charAt(0) == 'f'){
					female.enqueue(g.substring(1));
				}
			
				else{
					male.enqueue(g.substring(1));
				}
			
			
				System.out.println("Input a gender and a name (x done to quit): ");
			g = scan.nextLine();
		}
		scan.close();
		System.out.println("Male: " + male.toString());
		System.out.println("Female: " + female.toString());
	}
}

		
