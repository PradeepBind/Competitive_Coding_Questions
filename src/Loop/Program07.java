// Q7. Accept a number from the user and print a table for that number

package Loop;
import java.util.*;
import static java.lang.System.out;


public class Program07 {
	public static void main(String[] args) {
		int num,res;
		
		Scanner sc=new Scanner(System.in);
		
		out.println("Enter Number");
		num=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			res=i*num;
			out.println(num+" X "+i+" = "+res);
		}
		
	}
}
