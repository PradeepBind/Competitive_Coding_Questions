// Q14. Accept start and end range from the user and print all odd numbers between them. (Give minimum two solutions)

package Loop;
import java.util.*;
import static java.lang.System.out;

public class Program14 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int start,end;
		out.println("Enter Start Range");
		start=sc.nextInt();
		out.println("Enter End Range");
		end=sc.nextInt();
		
		out.println("Odd Numbers Between "+start+" and "+end+" are :");
		
		// 1st Method
//		if(start%2==0)
//			start++;
//		
//		for(int i=start+2;i<=end;i+=2) {
//			out.println(i);
//			
//		}
		
		
		
		//2nd Method
		if((start&1)==0)
			start++;
		start+=2;
		while(start<end)
		{
			out.println(start);
			start+=2;
		}
		
		
	}
}
