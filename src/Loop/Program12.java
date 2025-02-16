// Q12. Accept a number from the user and print those many numbers after the number.

package Loop;
import java.util.*;
import static java.lang.System.out;

public class Program12 {
	public static void main(String[] adfd) {
		Scanner sc =new Scanner(System.in);
		
		int num,next;
		
		out.println("Enter number");
		num=sc.nextInt();
		
		out.println("Next "+num+" Number are:- ");
		for(int i = num; i<2*num;i++) {
			next=i+1;
			out.println(next);
		}
	}
}
