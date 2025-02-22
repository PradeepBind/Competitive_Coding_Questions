/*
Q1. Accept a number from the user and then give a choice to the user
1.square
2.Cube
3.exit
Based on the user’s choice, display the result. If the user enters invalid choice give appropriate message.	
*/

package Switch;
import java.util.*;
import static java.lang.System.out;

public class Program01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num,choice;
	
		
		
		
		while(true) {
			
			out.println("Enter Choice\t1:Square\t2:Cube\t3:Exit");
			choice=sc.nextInt();
			
			if(choice==3) {
				
				out.println(" -------------Program Completed -------------");
				break;
			}
			
			out.println("Enter Number");
			num=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				out.println(num);
				square(num);
				break;
			case 2:
				cube(num);
				break;
//			case 3: 
//				out.println(" -------------Program Completed -------------");
//				break;
			default:
				out.println("Please Choose correct options");
				
				
				
				
			}
			out.println(" -------------Operation Completed -------------");
		}
		
		
		
		
		
		
		
		
	}

	public static void square(int num) {
		
		int sqr=num*num;
		out.println(sqr);
		
		
	}

	public static void cube(int num) {
		int cube=num*num*num;
		out.println(cube);
		
		
	}
}
