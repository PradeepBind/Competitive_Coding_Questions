//Q6. Accept a number from the user and check if it is palindrome number or not

package Loop;
import java.util.*;
import static java.lang.System.out;

public class Program06 {
	public static void main(String[] arf) {
		int num,rev=0,operation,r;
		
		Scanner sc=new Scanner(System.in);
		
		out.println("Enter Number");
		num=sc.nextInt();
		
		operation=num;
		
		while(operation>0) {
			r=operation%10;
			rev=(rev*10)+r;
			operation=operation/10;
			
		}
		
		
		if(num==rev)
			out.println(num+" is Palindrome");
		else
			out.println(num+" is not Palindrome");
		
		
	}
}
