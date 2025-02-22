// Q4. Accept a sentence from the user and count number of words.

package String;
import java.util.*;
import static java.lang.System.out;

public class Program04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sen;
		out.println("Enter Sentence");
		sen=sc.nextLine();
		
		int wordCount=0;
		
		int l=sen.length();
		
		char[] arr;
		arr=sen.toCharArray();
		
		char ch=' ';
		
		
		for(int i=0;i<l;i++) {
			if(arr[i]!=ch)
				out.print("Space");
			else
				wordCount++;
			
		}
		
		
	}
}
