// Q1. Accept a number from the user and find the factorial of the number using recursion.

package Recursion;

import java.util.*;
import static java.lang.System.out;

public class Program01{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		out.println("Enter Number");
		int num=sc.nextInt();
		int fact;
		
		fact=factorial(num);
		
		
		out.println(fact);
		
	}

	public static int factorial(int num) {
		int f;
		if(num==0 || num==1)
			return 1;
		f=num*factorial(num-1);
		
		
		
		return f;
	}
}