// Q19. Accept 10 numbers from the user and print the highest and the 2nd highest number.

package Loop;
import java.util.*;
import static java.lang.System.out;

public class Program19 {
	public static void main(String[] dhjd) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,num1,num2,h,sh;
		
		out.println("Enter Number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		if(num1>num2)
		{
			h=num1;
			sh=num2;			
		}
		else {
			h=num2;
			sh=num1;
		}
			
					
		for(int i=2;i<10;i++) {
			
			num=sc.nextInt();
			
			if(num>h) {
				sh=h;
				h=num;
				
			}
			else if(num>sh && num!=h) {
				sh=num;
			}
			
		}
		
		out.println("Highest Number is: "+h+"\nSecond Highest Number is: "+sh);
}
}
