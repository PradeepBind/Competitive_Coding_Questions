// Q18. Accept 10 numbers from the user and print the lowest number.

package Loop;
import java.util.*;
import static java.lang.System.out;



public class Program18 {

	public static void main(String[] dd) {
	
		Scanner sc= new Scanner(System.in);
		
		int num,lowest; 
	
	
	out.println("Enter Numbers");
	num=sc.nextInt();
	
	lowest=num;
	
	for(int i = 1; i<10; i++) {
		
		num=sc.nextInt();
		if(num<lowest)
			lowest=num;	
		
	}
	
	out.println("lowest Number is "+lowest);
	
	}
}
