package NovWeek7_RepeatProblem;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class P771_JewelAndStone {
//https://leetcode.com/problems/jewels-and-stones/description/
	@Test
	public void positive() {
	String jewels = "aA";
	String stones = "aAAbbbb";//3
	find(jewels,stones);
}
   /**
    * Create Set, tranvers til n-1 , add all jewels character to set 
    * create another loop traverse till n-1, check is character presnent in set
    * if present increment the count and return it;
    */
	
	//O[n] and O[n]
private int find(String jewels, String stones) {
	int count = 0;
	HashSet<Character>set =new HashSet<Character>();
	for (int i = 0; i < jewels.length(); i++) {
		set.add(jewels.charAt(i));
	}
	for (int i = 0; i < stones.length(); i++) {
		if(set.contains(stones.charAt(i))) {
			count++;
		}
	}
	System.out.println(count);
	return count;
}
}