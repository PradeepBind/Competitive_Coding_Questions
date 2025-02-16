// Q6. Accept principal amount, rate of interest and years of investment then find the simple interest

package BasicIfElse;
import java.util.*;
import static java.lang.System.out;

public class Program06 {
	public static void main(String[] args) {
		
		float principal,rateOfInterest,si;
		int year;
		
		Scanner sc = new Scanner(System.in);
		
		out.println("Enter Principal Amount");
		principal = sc.nextFloat();
		
		out.println("Enter Rate of Interest");
		rateOfInterest = sc.nextFloat();
		
		out.println("Enter Duration in year");
		year = sc.nextInt();
		
		si=(principal*rateOfInterest*year)/100;
		out.println("Simple Interest is "+si);
		
		
		
		
	}
}