package D15_16_2Pointers;

import org.junit.Test;

public class SubStringVowel {
  
	@Test
	public void positive() {
		String s = "workaattech";
		int k = 3;
		findSubStringVowel(s , k);
	}
	
	/*Pseudocode
	 * traverse throught the chara array till k value
	 * Check character is vowel or not
	 * If vowel only, add to counter
	 * traverse till n-1 character array
	 * Check max value and return
	 */
	

	private int findSubStringVowel(String s, int k) {
		char[] ch = s.toCharArray();
		int count = 0; int i =0; int max = Integer.MIN_VALUE;
		
		 for (i = 0; i < k; i++) {
			  if(isVowel(ch[i])) {
			count++;
		}
    }
		while(i < ch.length) { 
			  max = Math.max(max, count);		 
			  
	}
		return max;
	}	
	private boolean isVowel(char chara) {
		if(chara =='a' || chara == 'e' || chara =='i' || chara == 'o' ||chara =='u' )
			return true;
		else
			return false;
	}
	
}
