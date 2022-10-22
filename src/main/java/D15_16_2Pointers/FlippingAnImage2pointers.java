package D15_16_2Pointers;

import java.util.Arrays;

import org.junit.Test;

public class FlippingAnImage2pointers {
//https://leetcode.com/problems/flipping-an-image/
	@Test
	public void positive() {
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		//o/p - Output: [[1,0,0],[0,1,0],[1,1,1]]
		flipInvert(image);
		
	}

	private int[][] flipInvert(int[][] image) {
		
		//logic for flipping;
		for (int i = 0; i < image.length; i++) {
			int left = 0, right = image[i].length-1;
			while(left<=right) {
			int temp =  image[i][right];
			image[i][right--] =image[i][left];
			image[i][left++] = temp;
			}
			
		}
		
		//Logic for Inverting
	/*for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image.length; j++) {
				if(image[i][j] == 0) {
					image[i][j] = 1;
				}
				else {
					image[i][j] = 0;
				}
			}
			
		}*/
		
		
		for (int i = 0; i < image.length; i++) {
			int rig =0;
		    while(rig < image[i].length)	{  
		    	if(image[i][rig] == 0) {
					image[i][rig] = 1;
				}
				else {
					image[i][rig] = 0;
				}
		    	rig++;
		    }

		}
		
		for (int i = 0; i < image.length; i++) {
			System.out.println();
			for (int j = 0; j < image.length; j++) {
				System.out.print(image[i][j]);
				
			}
		}
		
		
		
		
		//System.out.println(Arrays.toString(image));
		return image;
		
		
		
	}
}
