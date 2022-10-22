package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Test;

public class SortArray2Pointer {
	
	@Test
	public void positive() {
		int[] nums = {5,1,4,3};
		sortArray(nums);	
}
	
	/*
     * Psuedocode:
     * Traverse through first for loops , with index i from 0 to n-1
     * Traverse through second for loops , with index i+1 from 0 to n-1
     * check if nums[i] greater than nums[j] condition
     * if so, then swap numa[i], nums[j] using temp varaiable
     * 
     */
	
	
    // int highVal = Integer.MIN_VALUE, lowVal = Integer.MAX_VALUE;
	private void sortArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
			    if(nums[i] > nums[j]) {
			    	int temp = nums[i];
			    	nums[i] = nums[j];
			    	nums[j] = temp;
			    }
			    
			    }
			}
		System.out.println(Arrays.toString(nums));
		
		}
		
	}
