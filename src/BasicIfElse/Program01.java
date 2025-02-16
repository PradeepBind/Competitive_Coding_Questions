// Q1. Swap 2 variable without using 3rd variable. (Give minimum three solutions)

package BasicIfElse;
import java.util.*;
import static java.lang.System.out;


public class Program01 {
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		out.println("Enter Number");
		a=sc.nextInt();
		b=sc.nextInt();
		
		// 1st method
//		out.println("Before Swap a = "+ a + " b = "+b);
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		out.println("After Swap a = "+ a + " b = "+b);
			
		
		
		// 2nd Method
		
//		out.println("Before Swap a = "+ a + " b = "+b);
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		out.println("After Swap a = "+ a + " b = "+b);
		
		// 3rd Method
		out.println("Before Swap a = "+ a + " b = "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		out.println("After Swap a = "+ a + " b = "+b);
		
		
		
		
		
		
	}
}
