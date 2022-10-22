package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParity2 {
//https://leetcode.com/problems/sort-array-by-parity-ii/
	
  @Test
  public void positive() {
	  int[] nums = {4,2,5,7}; // Output: [4,5,2,7]
	  sortArrayByParity2(nums);
  }
  @Test
  public void negative() {
	  int[] nums = {}; // Output: [4,5,2,7]
	  sortArrayByParity2(nums);
  }
  @Test
  public void edge() {
	  int[] nums = {1,1,1,1}; // Output: [4,5,2,7]
	  sortArrayByParity2(nums);
  }
  
  
  /*/* * Psuedocode:
   * 1) Initialize a new output array with same as i/p array size
   * 2) let output index variable be x and y
   * 3) traverse through array from 0 to n-1 length
   * 4) if nums[i] is even,add to output[x], then increment x value to even index only
   * 5) traverse through array from 0 to n-1 length
   * 6) if nums[j] is odd,add to output[y], then increment y value to odd index only
   */

private int[] sortArrayByParity2(int[] nums) {
	 int[] output = new int [nums.length] ;
	 int x = 0; int y = 1;
	  for (int i = 0; i < output.length; i++) {
		if(nums[i]%2 == 0) {
			output[x++] = nums[i];
			x=x+1;
		}
	}
	  
	  for (int j = 0; j < output.length; j++) {
			if(nums[j]%2 != 0) {
				output[y++] = nums[j];
				y = y+1;
			}
	  }
	  
	  System.out.println(Arrays.toString(output));
	  return output;
	
}
}
