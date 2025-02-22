// Q4. Accept a number from the user and print the Fibonacci series till that number using recursion.
package Recursion;
import java.util.*;
import static java.lang.System.out;

public class Program04 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int num,f1=0,f2=1;
		
		out.println("Enter number");
		num=sc.nextInt();
		
		out.print(f1+" "+f2+" ");
		fibo(num,f1,f2);
	}

	private static void fibo(int num,int f1,int f2) {
		int next=f1+f2;
		if(next>num)
			return;
		out.print(next+" ");
		f1=f2;
		f2=next;
		fibo(num,f1,f2);
		
	}
}
