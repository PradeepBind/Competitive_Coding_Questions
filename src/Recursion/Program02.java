// Q2. Convert the given number to Binary using recursion.

package Recursion;
import java.util.*;
import static java.lang.System.out;

public class Program02 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int num;
		
		out.println("Enter Positive Number");
		num=sc.nextInt();
		
		if(num==0)
			out.print(0);
		
		getBinary(num);
		
		sc.close();
		
	}

	public static void getBinary(int num) {
		int r;
		
		if(num<=0) {
			return;
		}
		
		r=num%2;
		int hold=num/2;
		getBinary(hold);
		out.print(r);
		
		
	}

	
}
