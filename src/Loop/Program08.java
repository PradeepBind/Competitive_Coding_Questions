/*
 
Q8. Accept a number from the user check if it is special number or not? 
Example: 145 
1!=1
4!=1*2*3*4 	= 24
5!=1*2*3*4*5  = 120
sum of the factorials is (1+24+120=145)

*/

package Loop;
import java.util.*;
import static java.lang.System.out;


public class Program08 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int fact=1 , num, sum=0, operation,r;
		
		out.println("Enter Number");
		num=sc.nextInt();
		operation=num;
		
		
		while(operation>0) {
			r=operation%10;
			
			for(int i=2;i<=r;i++) {
				fact=fact*i;
		}
			sum+=fact;
			operation/=10;
			fact=1;
			
			
		}
		if(num==sum)
			out.println("Entered Number:- "+num+" is Special Number");
		else
			out.println("Entered Number:- \""+num+"\" is Not a Special Number");
			
	}
}
