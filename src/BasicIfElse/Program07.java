/*
 Q7. Problem: Given the length of four sides of a figure, determine whether they can be used to create a polygon and determine if that polygon is a square. 
 A polygon can be created if no single side is greater than the sum of the other three sides. 
 Display a ONE when the status (for polygon or square) is confirmed and ZERO when the status cannot be confirmed.
 
 
 	Example Execution #1:
Enter the length of the four sides: 4 3 2 9
Length of sides: 4, 3, 2, 9
Polygon status: 1
Square status: 0


	Example Execution #2:
Enter the length of the four sides: 5 5 5 5
Length of sides: 5, 5, 5, 5
Polygon status: 1
Square status: 1

  */

package BasicIfElse;
import java.util.*;
import static java.lang.System.out;

public class Program07 {
	public static void main(String[] args)
	{
		int s1,s2,s3,s4;
		int Polygon=0,Square=0;
		
		Scanner sc = new Scanner(System.in);
		
		out.println("Enter length of all four Sides");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		
		
		if(s1==s2 && s2==s3 && s3==s4) {
			Square=1;
		}
		if(s1<(s2+s3+s4) && s2<(s1+s3+s4) && s3<(s1+s2+s4) && s4<(s1+s2+s3))
			Polygon=1;
		
		out.println("Polygon status: "+Polygon);
		out.println("Square status: "+Square);
		
	}
}
