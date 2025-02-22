// Q2. Accept a number from the user and find the factorial of the number

package Loop;
import java.util.*;
import static java.lang.System.out;


public class Program02 {
	public static void main(String[] abds) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		
		out.println("Enter Number");
		number = sc.nextInt();
		int fact=1;
		
		for (int i=2;i<=number;i++) {
			fact=fact*i;
		}
		
		out.println("Factorial of "+number+" is "+fact);
		
		
	}
}
