// Q1. Accept a string from the user, accept a character from the user and count the occurrence of the same.

package String;
import java.util.*;
import static java.lang.System.out;

public class Program01 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String str;
		char ch;
		
		out.println("Enter String");
		str=sc.next();
		
		out.println("Enter Character");
		ch=sc.next().charAt(0);
		
		countOccurence(str,ch);
		
		sc.close();
		
	}

	public static void countOccurence(String str, char ch) {
		char[] arr;
		arr=str.toCharArray();
		int l=arr.length;
		int count=0;
		
		for(int i=0;i<l;i++) {
			if(arr[i]==ch)
				count++;
		}
		
		out.println(ch+" Occurred "+count+" times");
		
		
	}
}
