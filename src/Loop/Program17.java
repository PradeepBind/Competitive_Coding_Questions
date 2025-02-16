// Q17. Accept 10 numbers from the user and print the highest number.

package Loop;
import java.util.*;
import static java.lang.System.out;

public class Program17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// Error With Negative Numbers
		
//		int num,highest=0;
//		
//		
//		out.println("Enter Numbers");
//		
//		for(int i = 1; i<=10; i++) {
//			
//			num=sc.nextInt();
//			if(num>highest)
//				highest=num;	
//			
//		}
//		
//		out.println("Highest Number is "+highest);
		
		
		
		
		
		int num,highest;
		
		
		out.println("Enter Numbers");
		num=sc.nextInt();
		highest=num;
		
		for(int i = 1; i<10; i++) {
			
			num=sc.nextInt();
			if(num>highest)
				highest=num;	
			
		}
		
		out.println("Highest Number is "+highest);
		
		
	}
}
