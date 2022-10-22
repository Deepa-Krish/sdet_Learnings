package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray2Pointers2IndexTakenFromLastLength {
//https://leetcode.com/problems/merge-sorted-array/
	  @Test
	  public void positive() {
		  int[] nums1 = {1,2,3,0,0,0};
		  int[] nums2 = {2,5,6}; 
		  int m= 3, n=3;//Output: [1,2,2,3,5,6]
          findArray( nums1, nums2, m, n);
	  }
	  @Test
	  public void edge() {
		  int[] nums1 = {0};
		  int[] nums2 = {1};  
		  int m= 0, n=1; //Output: [1]
        findArray( nums1, nums2, m, n);
	  }	
	  
	@Test
	  public void negative() {
		  int[] nums1 = {1};
		  int[] nums2 = {};  
		  int m= 1, n=0; //Output: [1]
          findArray( nums1, nums2, m, n);
	  }
	@Test
	  public void negative1() {
		  int[] nums1 = {4,5,6,0,0,0,}; 
		  int[] nums2 = {1,2,3,};       
		  int m= 3, n=3; //Output: [1,2,3,4,5,6]
        findArray( nums1, nums2, m, n);
	  }

	private int[] findArray(int[] nums1, int[] nums2,int m, int n) {
	
		int left = m-1, right = n-1; int third = m+n-1;

		
		/*if(nums1[left] == 1 && nums2[right] == 0) {
			//return nums1;
			break;
		} */
		
		while(left >= 0  && right >= 0 ) {
			
			if(nums1[left] > nums2[right]) {
				nums1[third]= nums1[left--];
			}
			
			else {
				nums1[third]= nums2[right--];
			}
			third--;
		}
		
		while(right >= 0) {
			nums1[third--]= nums2[right--];
		}
	
	
		System.out.println(Arrays.toString(nums1));
		return nums1;
		
		
		
	}
	  
}
