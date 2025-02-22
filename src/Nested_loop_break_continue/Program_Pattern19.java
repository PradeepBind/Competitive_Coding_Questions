/*

			111112
			322222
			333334
			544444
			555556
			766666

*/
package Nested_loop_break_continue;
import java.util.*;
import static java.lang.System.out;

public class Program_Pattern19 {
    public static void main(String[] args) {
    	
    	int num=1;
    	int even=2;
    	
    	for(int i=1;i<=6;i++) {
    		
    		for(int j=1;j<6;j++) {
    			out.print(num);
    			if(j==5) {
    				
    				out.print(even);
    			}
    			
    			
    		}
    		out.println();
    		
    	}

    
    
    
    }}