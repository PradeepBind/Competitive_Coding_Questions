// Q20. Write a program to print every integer between 1 and n divisible by m. Also report whether the number that is divisible by m is even or odd.

package Loop;
import java.util.*;
import static java.lang.System.out;


public class Program20 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		out.println("Enter the range ");
		n=sc.nextInt();
		out.println("Enter the value of m(Divisibility) ");
		m=sc.nextInt();
		if(m==0)
			out.print("Divisor canot be Zero");
		else {
		for(int i=1; i<=n;i++) {
			
			if(i%m==0) {
				if((i&1)==0) {
					out.println(i+" is Even");
					
				}
				else
					out.println(i+" is Odd");
			}
			
		}
		}
		
		
		
	}
		
		

}
