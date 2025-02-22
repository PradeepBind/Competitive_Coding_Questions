// DO sum of digits using recursion

package Recursion;
import static java.lang.System.out;
import java.util.*;

public class sumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		out.println("Enter Number");
		int num=sc.nextInt();
		
		int sum=sumDigit(num);
		out.println(sum);
	}

	private static int sumDigit(int num) {
		int operation=num;
		int r;
		r=operation%10;
		operation/=10;
		if(operation<=0)
			return r;
		int sum=r+sumDigit(operation);
		
		
		
		return sum;
		
		
		
	}
}
