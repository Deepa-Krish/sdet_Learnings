package Assessment;

import org.junit.Test;

public class Prog1 {
//	Explanation: A = 1, B = 1. A + B = n and both A and 
//			B do not contain any 0 in their decimal representation.
	
	@Test
	public void positive() {
		int n = 2;  //Output: [1,1]
		finssum(n);
		
	}
	@Test
	public void neg() {
		int n = 11;  //Output: [1,1]
		finssum(n);
		
	}

private void finssum(int n) {
	/*Pseudocode   
	Travserse through 2 loop till n
	Initial an array
	add i and j value, if equal, add to the array, return
	if not equaliterate through loop and check 3rd point and return
	       
	   /*     int [] arr = new int[2]; int x = 0
	        for(int i = 1; i < n; i++ ){
	            for(int j = 1; i<n; j++){
	               if(n = i + j){
	               arr[x++] = arr[i];
	               arr[x++] = arr[j];
	                   retun arr;
	               }
	          else {
	              return 0;
	          }      
	                
	            }
	        } 
	    } */
	 
	        
	/*Pseudocode   
	Considered 2 variable and initialised to 1
	traverse through lopp till n
	check if sum of 2 variable is n value
	if equal to n, add indices
	not equal increment right 
	if not incement left
        
	    */    
	        
	       if(n <= 0){
	           return false;
	       }
	   
	        int left = 1; int right = 1;
	        ArrayList<Integer> list = new ArrayList<>();
	        while(left < n && right < n){
	            if(n = left + right){
	                list.add(left);
	                list.add(right);
	            }     
	     else{
	         if(right<=9){
	            right = right+1;
	                }
	         else{
	             left = left+1;
	             right = 1;
	         }
	                    
	            }
	            
	          int[] arr = new int[2];
	            for(int j = 0; j<list.size(); j++){
	                arr[j] = list.get(j);
	            }
	            
	            return arr;
	
}
	
}	
	        
	