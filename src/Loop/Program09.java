/*
 Q9. Accept a number from the user and check if it is an Armstrong number or not ? Example: 153
1 cube =1 
5 cube =125 
3 cube = 27
sum of the cubes is (1+27+125=153)
 
 * */

package Loop;
import java.util.*;
import static java.lang.System.out;

public class Program09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num ,len=0, operation,r, sum=0,pow=1;
		
		out.println("Enter Number");
		num=sc.nextInt();
		
		
		
		operation=num;
		while(operation>0) {
			len++;
			operation/=10;
		}
		
		
		operation=num;
		
		
		while(operation >0) {			
			r=operation%10;
			
			for(int i=1;i<=len;i++) {
				pow*=r;
			}
			sum+=pow;
			operation/=10;
			pow=1;
			

		}
		
		
		
		
		if(num==sum)
			out.println("Entered Number \""+num+"\" is Armstrong Number");
		else
			out.println("Entered Number \""+num+"\" is Not Armstrong Number");
			
			
		
	}
}
