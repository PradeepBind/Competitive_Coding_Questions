// Hexadecimal to decimal

package Recursion;
import java.util.*;
import static java.lang.System.out;

public class hexToDecimal {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String hex; //1AC --> 428
		int value;
		int decimal=0,j=0;
		out.println("Enter Hexadeciaml");
		hex=sc.next();
		
		int len=hex.length()-1;
		
		for(int i=len;i>=0;i--) {
			
			if(hex.charAt(i)>='0' && hex.charAt(i)<='9') {
				value=hex.charAt(i)-48;
				decimal+=value*Math.pow(16, j);
				j++;
			}
			else {
				
				value=hex.charAt(i)-55;
				decimal+=value*Math.pow(16, j);
				j++;
			}
			
		}
		
		out.println("Decimal of "+hex+" is "+decimal);
		
		
	}
}
