// Q11. Accept a number from the user and print the next 5 numbers.

package Loop;
import java.util.*;
import static java.lang.System.out;
public class Program11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num,next;
		out.println("Enter number");
		num=sc.nextInt();
		
		for(int i=num;i<(num+5);i++) {
			next=i+1;
			out.println("next five numbers are "+next);
		}
	}
}
