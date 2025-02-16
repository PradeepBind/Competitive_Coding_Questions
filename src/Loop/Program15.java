//Q15. Accept a number from the user and print the Fibonacci series till that number.

package Loop;
import java.util.*;
import static java.lang.System.out;



public class Program15 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num,f1=0,f2=1;
		
		out.println("Enter Number");
		num=sc.nextInt();
		
		while(f1<=num) {
			out.print(f1+" ");
			int nxt = f1+f2;
			f1=f2;
			f2=nxt;
		}
		
	
		
		
		
		
	}
}
