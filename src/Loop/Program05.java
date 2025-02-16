// Q5. Accept a number from the user and reverse it.

package Loop;
import java.util.*;
import static java.lang.System.out;


public class Program05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int num,rev=0,r;
		
		out.println("Enter number");
		num=sc.nextInt();
		
		int operation=num;
		
		while(operation>0) {
			r=operation%10;
			rev=(rev*10)+r;
			operation/=10;
			
			}
		
		
		out.println("Reveser of "+num +" is "+rev);
		
	}
}
