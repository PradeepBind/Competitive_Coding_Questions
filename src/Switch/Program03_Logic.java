
package Switch;
import java.util.*;
import static java.lang.System.out;

public class Program03_Logic {
	
	
	public static boolean isPrime(int n) {
		
		if(n<2) {
			return false;
		}
		int l=n/2;
		for(int i=2;i<=l;i++) {
			if(n%i==0) {
				return false;
			}
			
		}
	
		
		
		return true;
			
	}
	
	
	
	public static void printPrime(int s,int e) {
		
		boolean hold;
		for(int i=s;i<=e;i++) {
		hold=isPrime(i);
		if(hold)
			out.print(i+",");
		
		
		
		}
		
	}
	
	
	
	public static void twinPrime(int s,int e) {
		boolean difference;
		for(int i=s;i<=e;i++) {
			if(i==2) {
				out.println(i+" and "+(i+1)+" is Twin Prime");
				difference=false;
				
			}
				
			else {
				difference=isPrime(i) && isPrime(i+2);
				
			}
			
			if(difference) {
				out.println(i+" and "+(i+2)+" are Twin Prime");
			}
				
		}
		
		
	}



	public static void primeAfterNumber(int num,int len) {
		int n=num;
		int found=0;
		num+=1;
		
		
		if(num<2)
			num=2;;
		
		
		
		while(found<len) {
			if(isPrime(num)) {
				out.print(num+" ");
				found++;
			}
			
			num++;
			
		}
		
		
	}
}
