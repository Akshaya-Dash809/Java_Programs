import java.util.Scanner;

/*The happy number can be defined as a number which will yield 1
 * when it is replaced by the sum of the square of its digits repeatedly.
 * If this process temps in an endless cycle of numbers containing 4, 
 * then the number is called an unhappy number.
 * For example, 32 is a happy number as the process yields 1 as follows
    3^2 + 2^2 = 13
    1^2 + 3^2 = 10
    1^2 + 0^2 = 1
  Some of the other examples of happy numbers are 7, 28, 100, 320 and so on.
 * */

public class HappyNo {
   
      
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Put a no which you want to check");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        
        while(temp>9) {
        	while(temp>0) {
        		int rem=temp%10;
        		sum=sum+rem*rem;
        		temp=temp/10;
        	}
        temp=sum;
        sum=0;
        }
        if(temp==1) {
        	System.out.println("Happy No");
        }
        else {
			System.out.println("Not Happy");
		}
          
        
        
        
        
   }  
}  


