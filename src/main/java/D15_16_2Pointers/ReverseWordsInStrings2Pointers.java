package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Test;

public class ReverseWordsInStrings2Pointers {

	@Test
	public void positive() {
	String s = "Let's take LeetCode contest";  // o/p:"s'teL ekat edoCteeL tsetnoc"
	 reverseWord(s);
	}
	private String reverseWord(String s) {
	      String[] strArr = s.split(" ");
	      
			char[] ch = s.toCharArray();
			
			 int temp = 0; int left = 0; 
			 char tem = 0;
			 
			for (int i = 0; i <= ch.length; i++) {
				if(i == ch.length || ch[i] == ' ' ) {
				//temp = i;		
				int right = i-1;
			while(left <= right ) {
				tem = ch[right];
				ch[right--] = ch[left];
				ch[left++] = tem;			
			}	
			 left = i+1;
		}	
			 
			
		}
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < ch.length; i++) {
			sb.append(ch[i]);
			}
			System.out.println(sb.toString());
			return sb.toString();
			}	
	

}
