// Q4. Accept a number from the user and calculate the sum of digits 


package Loop;
import java.util.*;
import static java.lang.System.out;

public class Program04 {
	public static void main(String[] abv)
	{
		Scanner sc= new Scanner(System.in);
		
		int num,sum=0;
		
		out.println("Enter Number");
		num=sc.nextInt();
		int operation=num;
		
		while(operation>0) {
			sum+=operation%10;
			operation=operation/10;
		}
		
		out.println("Sum of Digit of \""+num+"\" is "+sum);
		
	}
}
