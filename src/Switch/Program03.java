/*
Q6. Accept a number from the user and check if it is a prime number or not
Q7. Print all prime number between 51 to 100
Q8. Print all twin prime numbers between 1 to 20
Q9. Accept a number from the user and print that many prime numbers after the number.
Example: Input: 3
Output: 5,7,11
*/


package Switch;
import java.util.*;
import static java.lang.System.out;

public class Program03 {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	int choice;
	
	
	
	while(true) {
	out.println("\nEnter Choice");	
	out.println("1:-Check Number is Prime or Not");	
	out.println("2:-Print Prime Number Between Range");	
	out.println("3:-Print Twin Prime Number Between Range");	
	out.println("4:-print that many prime numbers after the number");	
	out.println("5:-Exit");	
	out.println();
	
	choice=sc.nextInt();
	
	if(choice==5)
	{	out.println("----------Program Exited----------");
		break;
	}
	
	
	switch(choice){
		
		case 1:
			out.println("Enter Number");
			int num=sc.nextInt();
			
			boolean hold;
			hold=Program03_Logic.isPrime(num);
			if(hold)
				out.println(num+" is Prime Number");
			else
				out.println(num+" is Not Prime Number");
			
			break;
			
		case 2:
			int s,e;
			out.println("Enter Start Range");
			s=sc.nextInt();
			out.println("Enter End Range");
			e=sc.nextInt();
			Program03_Logic.printPrime(s,e);
			break;
			
		case 3:
			int s3,e3;
			out.println("Enter Start range");
			s3=sc.nextInt();
			out.println("Enter end range");
			e3=sc.nextInt();
			
			
			Program03_Logic.twinPrime(s3,e3);
			break;
			
		case 4:
			out.println("Enter Number");
			num=sc.nextInt();//3
			int len=num;
			Program03_Logic.primeAfterNumber(num,len);
			break;
		
		
	}
	}
	
	
	
	

}
}
