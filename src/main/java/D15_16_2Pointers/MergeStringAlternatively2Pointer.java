package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Test;

public class MergeStringAlternatively2Pointer {
//https://leetcode.com/problems/merge-strings-alternately/
	@Test
		public void positive() {
			String word1 = "abc";
			String word2	 = "pqr";  //merged: a p b q c r
			mergeString(word1,word2);
		}
	@Test
	public void negative() {
		String word1 = "abc";
		String word2	 = "pqrs";  //merged: a p b q   r   s
		mergeString(word1,word2);
	}

	private Character [] mergeString(String word1, String word2) {
		 char[] ch1 = word1.toCharArray();
		 char[] ch2 = word2.toCharArray();
		 
		int left = 0, right = 0, x = 0;
		int size = ch1.length+ch2.length;
		Character [] arr = new Character [size];
		
		 while(left<ch1.length || right < ch2.length) {
		 if(left < ch1.length) {
			 arr[x++] =  ch1[left++];
		 }
		 if(right < ch2.length) {
			 arr[x++] =  ch2[right++];
		 }
	 }
		System.out.println(Arrays.toString(arr));
		return arr;
		//return new String(arr);
		
	}
	
	
}
