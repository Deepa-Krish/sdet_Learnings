package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Test;

public class RemoveElementReturnKValue2Pointers {
	//https://leetcode.com/problems/remove-element/
	@Test
	public void positive() {
		int[] nums = {3,2,2,3};
		int val = 3; //Output: 2, nums = [2,2,_,_]
		removeEle(nums, val);
		
	}
	
	@Test
	public void negative() {
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2; //Output: 5, nums = [0,1,4,0,3,_,_,_]
		removeEle(nums, val);
		
	}

	@Test
	public void edge() {
		int[] nums = {0,1,2,2,3,0,4,2, 1};
		int val = 2; //Output: 6, nums = [0,1,4,0,3,_,_,_]
		removeEle(nums, val);
		
	}
	
	private int removeEle(int[] nums, int val) {
		
		int left = 0, right = nums.length-1;
		int count = 0;
		
		while(left <= right) {
			
			if(nums[left] != val) {
				left++;
				count++;
			}
			 
			/*else if(nums[left] == val && nums[right] == val) {
				right--;
				//int temp =	nums[right];
				//nums[right] = nums[left];
				//nums[left++] = temp;
				count++;
			} */
			
			//else if(nums[left] == val && nums[right] != val) {
			else if(nums[left] == val ) {
			int temp =	nums[right];
			nums[right--] = nums[left];
			nums[left] = temp;
			//count++;
			}
			//System.out.println(Arrays.toString(nums));
		}
			
		System.out.println(Arrays.toString(nums));
		System.out.println("k = " + count);
		 return count;
		
		
		
	}
	
}
