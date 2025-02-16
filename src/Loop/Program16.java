// Q16. Accept a number and a single digit from the user. Then check the number of occurrences of that digit in the number.

package Loop;
import java.util.*;
import static java.lang.System.out;

public class Program16 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num,find,count=0,operation,r;
		
		out.println("Enter Number");
		num=sc.nextInt();
		
		operation=num;
		
		out.println("Enter Digit (0-9) Which You Want to find in Entered Number");
		find=sc.nextInt();
		
		if(find<0) {
			out.println("Please Enter Positive Number");
		}
		else {
		while(operation>0) {
			r=operation%10;
			if(r==find) 
				count++;
			
			operation/=10;
			
		}
		
		out.println(find+" Occured "+count+" times in "+num);
		
		}
		
	}
}
