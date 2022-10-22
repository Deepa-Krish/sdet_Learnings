package D15_16_2Pointers;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class HappyNumbers2PointersNew1 {

	@Test
	public void positive() {
		int n = 19;  //o/p- true
		findHappyNo(n);
	}
	
	@Test
	public void negative() {
		int n = 2;  //o/p- false
		findHappyNo(n);
	}
	
	@Test
	public void edge() {
		int n = 1221;  //o/p- true
		System.out.println(findHappyNo(n));
	}

	
		 
		private boolean findHappyNo(int n) {
		
		Set<Integer> set = new HashSet<Integer>();				
		while(n != 1 && !set.contains(n) ) {
			set.add(n);
						
	     	n =HappyLogic(n); //  82 = 19;//
		}
		return (n == 1);
						
	}
		
		private int HappyLogic(int n) {
			int rem =0,  sum = 0;
			while(n > 0) {
				rem = n%10;  
				sum += (rem * rem) ;   //sum = sum + (rem * rem)
				n = n/10;
			}
			return sum;
			
		}
	
}


