// 
// Hexa to decimal using recursion
package Recursion;
import java.util.*;
import static java.lang.System.out;

public class Program03 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String hex;
		out.println("Enter Hexadecimal");
		hex=sc.next();
		
		int index=hex.length()-1;
		int decimal;
		decimal=toHexa(hex,index);
		out.println(decimal);
	}

	private static int toHexa(String hex, int index) {
		
		int val=0;
		int res;
		if(index<0)
			return 0;
		
		char ch=hex.charAt(index);
		if(ch>='0' && ch <='9')
			val=ch-48;
		else if(ch>='A' && ch<='F')
			val=ch-'A'+10;
		else if(ch>='a' && ch<='f')
			val=ch-'a'+10;
		
		int power=hex.length()-1-index;
		res=val*(int)Math.pow(16, power)+toHexa(hex, index-1);
		return res;
		
	}

	
}
