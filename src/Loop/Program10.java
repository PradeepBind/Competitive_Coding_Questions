// Q10. Go on accepting numbers from the user till the user enters 0 and calculate the sum of these numbers.

package Loop;
import java.util.*;
import static java.lang.System.out;

public class Program10 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int num=1,sum=0;
		out.println("Enter Number\nPress Zero(0) to Exit");
		while(num!=0)
		{
			num=sc.nextInt();
			sum+=num;
		}
		
		out.println("The Sum of Entered Number is "+sum);
	}
}
