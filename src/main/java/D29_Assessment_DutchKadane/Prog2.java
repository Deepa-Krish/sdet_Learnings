package Assessment;

import org.junit.Test;

public class Prog2 {
//	Explanation: A = 1, B = 1. A + B = n and both A and 
//			B do not contain any 0 in their decimal representation.
	
	@Test
	public void positive() {
		int[] numbers = {2,7,11,15};
		int target = 9;
		finssum(numbers, target);
		
	}
	@Test
	public void negative() {
		int[] numbers = {2,3,4};
		int target = 6;
		finssum(numbers, target);
		
	}
	@Test
	public void edge() {
		int[] numbers = {-1,0};
		int target = -1;
		finssum(numbers, target);
		
	}

private void finssum(int[] numbers, int target) {
	/*Pseudocode
	traverse through while loop til arr-1
	taken left as 0 and right as n-1
	adding both varaiable, matches the target , return the indices
	if traget > sum, increment the left
	if target < sum , decrement the right


	*/
	        
	        int left = 0, right = numbers.length-1, sum =0;
	        int x = 0;
	        int[] arr = new int [ 2];
	       
	        while(left < right){
	            
	            sum += numbers[left]+numbers[right];  //17
	             if( target < sum ){
	                 right--;
	             }
	         else if( target > sum ){
	                 left++;
	             }
	            
	           else if(sum == target){  
	                arr[x++] = left;
	                arr[x] = right;
	               
	            }     
	            
	        }
	        
	        return arr;
}
	
}	
	        
	