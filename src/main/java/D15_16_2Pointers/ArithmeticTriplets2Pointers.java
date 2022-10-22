package D15_16_2Pointers;


import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ArithmeticTriplets2Pointers {
 //https://leetcode.com/problems/number-of-arithmetic-triplets/submissions/
	@Test
	public void positive() {
		int[] nums = {0,1,4,6,7,10};
		int diff = 3;             //O/p : 2
	//	System.out.println(FindArthTrip(nums, diff));
		System.out.println(FindArthTripUsingSet(nums, diff));
	}
	
	@Test
	public void negative() {
		int[] nums = {4,5,6,7,8,9};
		int diff = 2;             //O/p : 2
	//	System.out.println(FindArthTrip(nums, diff));
		System.out.println(FindArthTripUsingSet(nums, diff));
	}

/*	private int FindArthTrip(int[] nums, int diff) {
		 int count =0;
		for(int i=0; i< nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					
		if(nums[j]-nums[i] == diff && nums[k]-nums[j] == diff )	
			count++;
			
				}
			}
		}
		
		return count;		
	} */
	
	 //O[N] and O[1] 
	private int FindArthTripUsingSet(int[] nums, int diff) {

		Set<Integer> set = new HashSet<Integer>();
		
		for (int i : nums) {
			set.add(i);
		}
		int count = 0;
		for (int i : nums) {
			if(set.contains(i + diff) && set.contains(i + 2*diff)) {
			count++;
		}
	}
	return count;
	}
	
}



