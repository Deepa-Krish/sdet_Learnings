package D15_16_2Pointers;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class CheckNandItsDoubleExist {
//https://leetcode.com/problems/check-if-n-and-its-double-exist/
	@Test
	public void positive() {
		int[] arr= {10,2,5,3}; //Op : true, value 5
		findDouble(arr);
	}
	
	@Test
	public void negative() {
		int[] arr= {3,1,7,11}; //O/p :false
		findDouble(arr);
	}
	
	@Test
	public void edge() {
		int[] arr= {7,1,14,11}; //O/p :true
		findDouble(arr);
	}
	
	@Test
	public void edge2() {
		int[] arr= {-20,8,-6,-14,0,-19,14,4}; //O/p :true
		System.out.println(findDouble2(arr));
	}
	//5,2,3,4

	private boolean findDouble(int[] arr) {
		int li = 0, rj = 1;
		
		while(rj < arr.length) {
			if(arr[li] == 2 * arr[rj] ) {
				System.out.println("ist if " + arr[rj]);
				return true;
			}
			
			if(arr[li] ==  arr[rj]/2  && arr[rj]%2 == 0) {
				System.out.println("2nd if " +arr[rj]);
				return true;
			}
			
			if (arr[li] != 2 * arr[rj]){
				rj++;
		}
		
		}	
		System.out.println("No match");
		return false;
		
}
	
	private boolean findDouble2(int[] arr) {
		int li = 0;  //{7,1,14,11}
		
		Set<Integer> set = new HashSet<Integer> ();
		    
		while(li < arr.length) {
			if(set.contains(arr[li] * 2)||( set.contains(arr[li]/2) && arr[li]%2 == 0)) {
			return true;
			}
			set.add(arr[li]);
			li++;
			
		}
		 return false;
		
		
		
		
		
	}
}
