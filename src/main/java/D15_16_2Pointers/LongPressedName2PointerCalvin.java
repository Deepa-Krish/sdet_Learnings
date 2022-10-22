package D15_16_2Pointers;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LongPressedName2PointerCalvin {

	@Test
	public void positive() {
		String name ="alex";
		String typed = "aaleex"; //O/p true
		System.out.println(findLongPressName(name, typed));
	}
	@Test
	public void negative() {
		String name ="saeed";
		String typed = "ssaaedd"; //O/p false
		System.out.println(findLongPressName(name, typed));
	}

	@Test
	public void edge() {
		String name ="alex";
		String typed = "aaleexa"; //O/p false
		System.out.println(findLongPressName(name, typed));
	}
	
	@Test
	public void edge1() {
		String name ="bdad";
		String typed = "bbbd"; //O/p false
		System.out.println(findLongPressName(name, typed));
	}
	
	@Test
	public void edge2() {
		String name ="alex";
		String typed = "aaleexeex"; //O/p false
		System.out.println(findLongPressName(name, typed));
	}

	private boolean findLongPressName(String name, String typed){
		      //char[] nam =  name.toCharArray();
		     // char[] typ =  typed.toCharArray();
	    
		  int i = 0, j = 0;

 if (typed.length() < name.length() || typed.charAt(typed.length() - 1) != name.charAt(name.length() - 1) ||
      name.charAt(0) != typed.charAt(0)) {
		  return false;
		        }
 
     while (i < name.length() && j < typed.length()) {
        if (name.charAt(i) == typed.charAt(j)) {
         i++;
         j++;
     } 
     else {
         if (typed.charAt(j) == typed.charAt(j - 1)) {
             j++;
         } else {
             return false;
         }
     }
 }
    /* if (i == name.length() && j == typed.length()) {
         return true;
     }  
     
    else*/  if (i != name.length() && j == typed.length()) {
         return false;
     } else {
         while (j != typed.length()) {
             if (typed.charAt(j) == typed.charAt(j - 1)) {
                 j++;
             } else {
                 return false;
             }
         }
     }
     
     
     return true;
 	      
		
	}
}
