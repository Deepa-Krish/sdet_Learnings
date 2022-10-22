package D15_16_2Pointers;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class IntersectionOf2ArraysPart2_2Pointers {
  
	@Test
	public void positive() {
		int [] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};  //	Output: [2,2]
		findIntersections(nums1, nums2);
	}
	
	@Test
	public void negative() {
		int [] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};  //Output: [9,4] or [4,9]
		findIntersections(nums1, nums2);
	}
	
	private int[] findIntersections(int[] nums1, int[] nums2) {
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int left = 0, right = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(left < nums1.length && right < nums2.length) {
			if(nums1[left] < nums2[right]) {
				left++;
			}
			
			else if(nums1[left] == nums2[right]) {
				list.add(nums2[right]);
				right++;
				left++;
			}
			else if(nums1[left] > nums2[right]) {
				right++;
			}
		}
	
		System.out.println(list);
		int[] res = new int[list.size()]; 
		for (int i = 0; i < list.size() ; i++) {
			res[i] = list.get(i);
			
		}
		
		return res;
	}

}
