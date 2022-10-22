package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Test;

public class ShortestDistanceCharacterBF {
	//https://leetcode.com/problems/shortest-distance-to-a-character/
	@Test
	public void positive() {
		String s = "loveleetcode";// "lov0l00tcod0";
		char ch = 'e'; //Output: [3,2,1,0,1,0,0,1,2,2,1,0]
		shortestDist(s, ch);
	}
	
	@Test
	public void negative	() {
		String s = "aaab";
		char ch = 'b'; //Output: [3,2,1,0]
		shortestDist(s, ch);
	}

	private int[] shortestDist(String s, char ch) {
		char[] strch =  s.toCharArray();
		   int eIndex = Integer.MIN_VALUE/2;
		   int[] res = new int[strch.length];
		   
		   for (int i = 0; i < strch.length; i++) {
			   if(strch[i] == ch) {
				   eIndex = i ;      //give i value to eIdex
			   }
			   res[i] = i-eIndex;	 // 0 - (-1073741824)	
		}
		   System.out.println(Arrays.toString(res));
		    eIndex = Integer.MAX_VALUE/2;   //2147483647/2 =1073741823
		   for (int i = strch.length-1; i>=0; i--) {
			   if(strch[i] == ch)	{
			   eIndex = i;
		   }
		   res[i] = Math.min(eIndex - i, res[i]);
	}	   
		   System.out.println(Arrays.toString(res));
		   return res;
}	   
}