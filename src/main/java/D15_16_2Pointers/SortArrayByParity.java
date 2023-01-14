package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Test;

public class SortEvenOddArrayNos2Pointers {
   @Test
   public void positive() {
   int[] nums = {3,1,2,4};  //o/p = 2,4,3,1 or [2,4,1,3]
   findSumOfTwoNumbers(nums);
}
   @Test
   public void negative() {
 	  int[] nums = {}; // Output: []
 	 findSumOfTwoNumbers(nums);
   }
   @Test
   public void edge() {
 	  int[] nums = {1,1,1,1}; // Output: [4,5,2,7]
 	 findSumOfTwoNumbers(nums);
   }

   
/* * Psuedocode:
 * 1) even and odd array with size of i/p array, j = 0 and x = 0
2) traverse through array from 0 to n-1 index
3) if array[i]%2 == 0, store in evenarray[j] = array[i], array[i]/2 != 0 , oddarray[x] = array[i]store in another array2
3) merge oddArray into evenArray, while( j < evenArray.length)
4) evenArry[++j] = oddArray[x--] */
 
   private void findSumOfTwoNumbers(int[] nums) {
		int left = 0; int right = nums.length-1;
		
		while(left < right) {
			if(nums[left]%2 == 0) {
		    	left++;		
			}
			if(nums[right]%2 != 0) {
		    	right--;		
			}
			if(nums[left]%2 !=0 && nums[right]%2 == 0) {
				 int temp = nums[left];
				 nums[left++] =nums[right];
				 nums[right--] = temp;
			}
		}
				System.out.println(Arrays.toString(nums));
	}
	
   
   
}
