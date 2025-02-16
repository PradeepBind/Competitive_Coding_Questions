// Q1. Accept 10 numbers from the user and calculate their sum. (Do not use array)

package Loop;
import java.util.*;
import static java.lang.System.out;

public class Program_01 {
	
	public static void main(String[] args) {
		int sum=0;
		int a;
		Scanner sc = new Scanner(System.in);
		out.println("Enter Numbers");
		for(int i=1;i<=10;i++) {
			a=sc.nextInt();
			sum+=a;

		}
		
		out.println("Sum of entered number is "+sum);
		
	}
}
