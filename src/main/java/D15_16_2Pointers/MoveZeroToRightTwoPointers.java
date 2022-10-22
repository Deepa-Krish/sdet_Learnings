package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeroToRightTwoPointers {
//https://leetcode.com/problems/move-zeroes/	
	@Test
	public void positive() {
		int[] nums = {0,1,0,3,12};
		moveZeroToRhightTwoPointers(nums);
	}

	private void moveZeroToRhightTwoPointers(int[] nums) {
		int left = 0, right = 0;
		
		while(right < nums.length) {
			if(nums[right] == 0) {
				right++;
			}
			else {
				int temp = nums[right];
				nums[right++] = nums[left];
				nums[left++] = temp;
			}
		}
		
		System.out.println(Arrays.toString(nums));	
	}

}
