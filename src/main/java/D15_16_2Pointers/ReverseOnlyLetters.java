package D15_16_2Pointers;

import org.junit.Test;

public class ReverseOnlyLetters {
	@Test
	public void positive() {
		String s = "ab-cd";
		// o/p:"dc-ba"
		findRevLetter(s);
	}
	@Test
	public void negative() {
		String s = "a-bC-dEf-ghIj";
		//Output: "j-Ih-gfE-dCba"
		findRevLetter(s);
	}

	@Test
	public void edge() {
		String s = "Test1ng-Leet=code-Q!";
		//Output: "Qedo1ct-eeLg=ntse-T!"
		findRevLetter(s);
	}

	private String findRevLetter(String s) {
		char[] ch = s.toCharArray();
		int left = 0, right = ch.length-1;
		
		while(left<right) {
			if(Character.isLetter(ch[left]) && Character.isLetter(ch[right])) {
				char temp = ch[left];
				ch[left++] = ch[right];
				ch[right--] = temp;
            }
			
			else if(!Character.isLetter(ch[left]) && Character.isLetter(ch[right])){
            left++;
        }
			else if(Character.isLetter(ch[left]) && !Character.isLetter(ch[right])){
            right--;
        }
			else if(!Character.isLetter(ch[left]) && !Character.isLetter(ch[right])){
           left++;
           right--;
        }
		
	}	
		
		StringBuilder sb = new StringBuilder();
        for(char i : ch){
            sb.append(i);
        }
        System.out.println(sb.toString());
        return sb.toString();
		
		
	}
}
