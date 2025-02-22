//Q2. Accept a string and check if it is a palindrome or not. Example: nitin 
//Q3. Accept a string and reverse it.

package String;
import static java.lang.System.out;
import java.util.*;


public class Program02 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String str,strReverse;
		
		out.println("Enter String");
		str=sc.next();
		
		strReverse=reverse(str);
		out.println("Reversed of "+str +" is "+strReverse);
		
		
		isPalindrome(str,strReverse);
		
		sc.close();
		
		
	}

	public static void isPalindrome(String str, String strReverse) {
		if(str.equals(strReverse))
			out.println(str+" is Also Palindrome");
		
	}

	public static String reverse(String str) {
		
		char arr[];
		arr=str.toCharArray();
		int l=arr.length -1;
		String str2;
		char temp;
		
		for(int i=0;i<l-i;i++) {
			temp=arr[i];
			arr[i]=arr[l-i];
			arr[l-i]=temp;				
		}
		
		str2=String.valueOf(arr);
		
		
		return str2;
	}
}
