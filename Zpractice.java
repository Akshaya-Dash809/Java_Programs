import java.util.Arrays;
import java.util.Scanner;

public class Zpractice {
	public void rotate(int[] nums, int k) {
		
		if(k > nums.length)
		k=k%nums.length;
		int[] result = new int[nums.length];
		for(int i=0; i < k; i++){
		result[i] = nums[nums.length-k+i];
		}
		int j=0;
		for(int i=k; i<nums.length; i++){
		result[i] = nums[j];
		j++;
		}
		System.arraycopy( result, 0, nums, 0, nums.length );
	}
	public static void main(String[] args) {
	
//	System.out.println("Enter a no for nums");	
//	Scanner sc = new Scanner(System.in);

		Zpractice z= new Zpractice();
		
	    int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        
        // Call the rotate method
        z.rotate(nums, k);
        
        // Print the rotated array
        System.out.println("Rotated Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
