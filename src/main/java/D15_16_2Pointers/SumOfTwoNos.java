package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SumOfTwoNos {
	@Test
	public void positive() {
		int[] nums = {2,4,5,8,3,6,7};
		int target = 15;
		Assert.assertArrayEquals(findSumOfTwoNumbers(nums, target), new int[] {3,6});
		//findSumOfTwoNumbers(nums, target);
}
	@Test 
	public void negative() {
		int[] nums = {2};
		int target = 15;
		Assert.assertArrayEquals(findSumOfTwoNumbers(nums, target), new int[] {});		
	}
	
	@Test 
	public void edge() {
		int[] nums = {2};
		int target = 15;
		Assert.assertArrayEquals(findSumOfTwoNumbers(nums, target), new int[] {4,5});	
	}
	
	/*
     * Psuedocode:
     * 
     * 0) validation: check array size.. if it is less than 2, return empty array 
     * 1) traverse through array from 0 to n-1 index
     * 2) add the indice values and 
     * 3) compare against the target
     * 4) If it matches, store the start - end index
     * 5) Else, continue 
     * 6) Finally, return the last matching index !!
     * 7) If there are no matches --> then return empty array !!
     * 
     */

	private int[] findSumOfTwoNumbers(int[] nums, int target) {
		
	         int [] res = new int [2];		
	         if(nums.length < 2) {
	        	 return res;
	         }
	         
	         for (int i = 0; i < nums.length; i++) {
	        	 for (int j = i+1; j < nums.length; j++) {
	        		 if(nums[i]+nums[j] == target) {
	        			 res[0] = i;
	        			 res[1] = j;
	        		 }
					
				}
				
			} System.out.println(Arrays.toString(res));
	         return res;

		}
	}
