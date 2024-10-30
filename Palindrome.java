/*Palindrome number: A palindrome number is a number that is same after reverse. 
 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
 */
import java.util.*;
public class Palindrome { 
		 public static void main(String args[]){ 
		 Scanner sc = new Scanner(System.in);
		  int rem,rev=0,temp;    
		  System.out.println("Enter a no which you want to check");
		  int n=sc.nextInt();//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(temp>0){    
		   rem=temp%10;  //getting remainder  
		   rev=(rev*10)+rem;    
		   temp=temp/10;    
		  }    
		  if(n==rev)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  

