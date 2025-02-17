// Q1. Print all special numbers between 1 to 200000

/*
		 Special Number Example: 145 
		1!=1
		4!=1*2*3*4 	= 24
		5!=1*2*3*4*5  = 120
		sum of the factorials is (1+24+120=145) 
 */


package Nested_loop_break_continue;
import java.util.*;
import static java.lang.System.out;

public class Program1 {
	public static void main(String[] args) {
		
	
	int r,operation,fact=1,sum=0;
	
	
	
	for(int i=1;i<=40586;i++) {
	operation =i;
	int num=i;
	while(operation>0) {
		
		r=operation % 10;
		
		for(int j=2;j<=r;j++) {
			fact*=j;
		}
		
		
		sum+=fact;
		operation=operation / 10;
		fact=1;
		
	}
	
	if(num==sum) {
		out.println(num+ " is Special Number");
	}
	else
		out.println(num+ " is Not Special Number");
	
	sum=0;
	
	
	}
	}
	
}
