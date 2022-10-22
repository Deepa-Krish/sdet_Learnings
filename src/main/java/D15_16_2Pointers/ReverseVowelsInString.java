package D15_16_2Pointers;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class ReverseVowelsInString {
	/*Given a string s, reverse only all the vowels in the string and return it.
	 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
	 */


	/* Traverse through each element using while loop
	 * compare the element 
		      ->If !vowels, increment index of right and decrement index of left
		      -> if vowels swap the values and check for next index
	 *Print return
	 */

	@Test
	public void example1() {
		String s = "hello";
		//Output: "holle";
		//reverseVowels(s);
		Assert.assertEquals(reverseVowels(s), "holle");
	}

	@Test
	public void example2() {
		String s = "lEetcOde";
		//Output: "leOtcedE";
		//reverseVowels(s);
		Assert.assertEquals(reverseVowels(s), "leOtcedE");	
	}

	@Test
	public void example3() {
		String s = "l";
		//Output: "l";
		//reverseVowels(s);	
		Assert.assertEquals(reverseVowels(s), "l");

	}

	private String reverseVowels(String s){    //bidirectional 2 pointer

		char[] ch = s.toCharArray(); 
		int left = 0, right = s.length()-1;
		System.out.println(Arrays.toString(ch));
		while(left < right){

			if(isVowel(ch[left]) && isVowel(ch[right])){
				char temp = ch[left];
				ch[left++] = ch[right];
				ch[right--] = temp;
			}

			else if(!isVowel(ch[left]) &&  isVowel(ch[right])){
				left++;
			}
			else  {
				right--;
			}
		}
		System.out.println("String s = "+s);
		System.out.println(Arrays.toString(ch));
		//return new String(ch);
		return String.valueOf(ch);

	}
	private boolean isVowel(char chara) {
		if(chara =='a' || chara == 'e' || chara =='i' || chara == 'o' ||chara =='u'
				||chara =='A' || chara == 'E' || chara =='I' || chara == 'O' ||chara =='U' )
			return true;
		else
			return false;
	}
}
