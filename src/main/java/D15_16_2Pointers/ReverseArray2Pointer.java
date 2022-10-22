package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Test;

public class ReverseArray2Pointer {
	@Test
	public void positive() {
		int[] nums = {1,4,7,9};
		revArray(nums);	
}

	private void revArray(int[] nums) {
		
		int left = 0, right = nums.length-1;
		
		while(left<right) {
			int temp = nums[left];
			nums[left++] = nums[right];
			nums[right--] = temp;
			
		}
		
		System.out.println(Arrays.toString(nums));
		
	}
}
