// Q2. Print all Armstrong number between 1 to 200000
/*
 *		as length ig 153 is 3
		 1 cube =1 
		5 cube =125 
		3 cube = 27
sum of the cubes is (1+27+125=153)*/


package Nested_loop_break_continue;
import java.util.*;
import static java.lang.System.out;

public class Program02 {
	
	public static void main(String[] args) {
		
		int r,operation,k,res=1,sum=0;
		for (int num=1;num<=371;num++) {
			
			int power=0;
			operation=num;
			while(operation>0) {
				operation=operation/10;
				power++;
			}
			//power ko zero krna hai
			operation=num;
			while(operation>0) {
				r=operation % 10;
				
				for(k=1;k<=power;k++) {
					res*=r;
				}
				
				sum+=res;
				operation/=10;
				res=1;
				
				
				
				
			}
			if(sum==num) {
				out.println(num+" is Armstrong");
			}
			else
				out.println(num+" is Not Armstrong");
			
			
			sum=0;
			power=0;
				
			
			
			
		}
		
	}
}
