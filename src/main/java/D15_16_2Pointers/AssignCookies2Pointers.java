package D15_16_2Pointers;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class AssignCookies2Pointers {
//https://leetcode.com/problems/assign-cookies/
	
	@Test
	public void positive() {
		int[] g = {1,2,3};
		int[] s = {1,1};  //Output: 1
		findassignedcooky(g,s);
	}
	@Test
	public void negative() {
		int[] g = {1,2};
		int[] s = {1,2,3};  //1,2 Output: 2
		findassignedcooky(g,s);
	}
	
	@Test
	public void edge() {
		int[] g = {10,9,8,7};
		int[] s = {5,6,7,8};  //7,8 Output: 2
		findassignedcooky(g,s);
		
	}
	@Test
	public void edge2() {
		int[] g = {10,9,8,7,10,9,8,7};
		int[] s = {10,9,8,7};  //7,8,9,10 Output: 4
		findassignedcooky(g,s);
		
	}

	private int findassignedcooky(int[] g, int[] s) {

	 Arrays.sort(g);
	 Arrays.sort(s);
     int i =0, j=0,count=0;
    // Set<Integer> set = new HashSet<>();
     
     while(i<g.length && j<s.length) {
    	 
    	 if(s[j] >= g[i]) {
    		// set.add(s[j]);
    		 count++;
    		 i++;
    		 j++;	
    	 }
    	 else if(s[j] < g[i]) {		 
    		 j++;
    	 }
     }	
		//System.out.println(set);
		System.out.println("count = "+count);
		//System.out.println(set.size());
		 return count;
		
		
		
	}

	
}
