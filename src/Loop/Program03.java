// Q3. Accept 10 numbers from the user and count how many are positive, negative or zero.

package Loop;
import java.util.*;
import static java.lang.System.out;

public class Program03 {

	public static void main(String[] abc) {
		Scanner sc = new Scanner(System.in);
		int num,positive=0,negative=0;
		out.println("Enter Numbers");
		for(int i=1;i<=10;i++) {
			
			num=sc.nextInt();
			if(num>0)
				positive+=1;
			else
				negative+=1;
		}
		
		out.print("Count of Positive number is "+positive +" and count of Negative number is "+negative );
		sc.close();
	}
}
