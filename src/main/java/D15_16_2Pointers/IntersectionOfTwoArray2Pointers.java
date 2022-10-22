package D15_16_2Pointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class IntersectionOfTwoArray2Pointers {
//https://leetcode.com/problems/intersection-of-two-arrays/
	@Test
	public void positive() {
		int [] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};  //	Output: [2]
		findIntersection(nums1, nums2);
	}
	
	@Test
	public void negative() {
		int [] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};  //Output: [9,4] or [4,9]
		findIntersection(nums1, nums2);
	}

	private int[] findIntersection(int[] nums1, int[] nums2) {
		
	 Arrays.sort(nums1);
	 Arrays.sort(nums2);
	 
	int left = 0, right = 0 , x = 0, size = 0;
/*	if(nums1.length > nums2.length || nums1.length == nums2.length) {
		  size = nums1.length;
	 }
	 else { size = nums1.length;
	 } */
	
	
	
	Set<Integer> set = new HashSet<Integer>();   //use List
	while(left < nums1.length &&  right < nums2.length) {
	    if(nums1[left] == nums2[right]) {    	
	//	  res[x++] =  nums1[left];
	      set.add(nums1[left]);
		  left++;
		  right++;	
	}
	    else if(nums1[left]<nums2[right]) {
	    	left++;
	    }
	    
	    else  if(nums1[left]>nums2[right]) {
	    	right++;
	    }	    
	    
	} //System.out.println(set);
	 
	 // return set.toArray();
	 int[] res = new int[set.size()]; int j =0;
	 for (int i : set) {
		 res[j] = i;
		 j++;
		
	} return res;
		
	}
				
		
	}	

