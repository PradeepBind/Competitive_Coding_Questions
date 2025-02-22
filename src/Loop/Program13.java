// Q13. Accept a start and end range from the user and print all even number between them. (Give minimum two solutions)


package Loop;
import java.util.*;
import static java.lang.System.out;

public class Program13 {
	public static void main (String[] adcd) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int start,end;
		out.println("Enter Start Range");
		start=sc.nextInt();
		out.println("Enter End Range");
		end=sc.nextInt();
		
		
		// 1st Method
//		out.println("Even Numbers Between "+start+" and "+end+" are");
//		for(int i = start+1; i<end; i++) {
//			if(i%2==0)
//				out.print(i+"\t");
//		}
		
		// 2nd Method
//		out.println("Even Numbers Between "+start+" and "+end+" are");
//		
//		if(start%2!=0)
//			start++;
//		
//		for(int i=start;i<end;i+=2) {
//			out.println(i);
//		}
		
		
		
		//3rd Method
		
		out.println("Even Numbers Between "+start+" and "+end+" are");
		if((start&1) == 1)
			start++;
		else
			start+=2;
		
		while(start<end) {			
			out.println(start);
			start+=2;
			
		}
		
		
	}
	
}

