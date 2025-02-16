/* 
Accept a marks from user and print its grade
1) marks>=75 --> Grade A
2) marks>=55 --> Grade B
3) marks>=35 --> Grade C

 */

package BasicIfElse;
import java.util.*;
import static java.lang.System.out;

public class Program02 {

	public static void main(String[] abd)
	{
		Scanner sc = new Scanner(System.in);
		int marks;
		out.println("Enter Your Marks");
		marks=sc.nextInt();
		if(marks>=75)
			out.println("Grade A");
		else if(marks>=55)
			out.println("Grade B");
		else if(marks >=35)
			out.println("Grade C");
		else
			out.println("Fail");
		
		
		
	}
}



