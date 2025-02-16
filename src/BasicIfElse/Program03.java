/*
 
 Q3. Accept a number from the user - if it is divisible by 3 print “three” , if it is divisible by 7 print
“seven” and if it is divisible by both 3 & 7, print “three -seven”

*/
package BasicIfElse;
import java.util.*;
import static java.lang.System.out;
public class Program03 {
	public static void main(String[] args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		out.println("Enter Number");
		a=sc.nextInt();
		if(a%3==0) {
			if(a%7==0)
				out.println("three-seven");
			else
				out.println("three");
		}
		else
			out.println("seven");

		
	}
}
