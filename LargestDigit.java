// Java program to largest and smallest digit of a number

import java.util.*;
 
class LargestDigit
{
   
	 public static void main(String[] args) {
		  Scanner cs = new Scanner (System.in);
		       System.out.println ("Enter the number");
		     int num = cs.nextInt ();
		     int reminder, Largest= 0;
		    while (num > 0)
		    {
		        reminder = num % 10;
		        if (Largest< reminder) 
		        {
		            Largest= reminder;
		        }
		        num = num / 10;
		    }
		    System.out.println("\nThe Largest Digit is "+Largest);
		 }
		}

		