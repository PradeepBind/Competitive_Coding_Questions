/*
		1
		12
		123 
		
		
		1
		22
		333
		
		
		1
		23
		456
 */

package Nested_loop_break_continue;
import java.util.*;
import static java.lang.System.out;
import java.lang.Math;

public class Program_Pattern1_2 {
	
	public static void main(String[] args) {
		
//		for(int i=1;i<=3;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				out.print(j);
//			}
//			
//			out.println();
//		}
		
		

		
//		for(int i=1;i<=3;i++) {
//			int hold=i;
//			for(int j=1;j<=i;j++) {
//				out.print(hold);
//			}
//			out.println();
//		}
		
		
		/*
		
		1
		23
		456
		
		*/
		// Half Code
		for(int i=1;i<=3;i++) {
			
			int hold=i;
			
			for(int j=1;j<=i;j++) {
				out.print(hold++);
//				hold++;
			}
			
			out.println();
			
		}
		
		
	}
}
