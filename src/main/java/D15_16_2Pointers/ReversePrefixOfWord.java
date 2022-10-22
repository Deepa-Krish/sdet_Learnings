package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Test;

public class ReversePrefixOfWord {
 //https://leetcode.com/problems/reverse-prefix-of-word/
	@Test
	public void positive() {
		String word = "abcdefd";
		String ch = "d"; //Output: "dcbaefd"
		findRev(word, ch);
	}
	

private String findRev(String word, String ch) {
	char[] cha = word.toCharArray();
	char[] ch1 = ch.toCharArray();
	int j = 0;
	int left =0, right = 0;
	char temp = 0;
	
	for (int i = 0; i < cha.length; i++) {
		if(cha[i] == ch1[j]) {
		 right = i;
			break;
		}
	}
	 while(left <= right) {
		 temp = cha[right];
		 cha[right--] = cha[left];
		 cha[left++] = temp;
}
     System.out.println(Arrays.toString(cha));
     
     String res = "";
     for (int k = 0; k < cha.length; k++) {
		res = res + cha[k];
	}
     System.out.println(res);
	 return res;
}

}
