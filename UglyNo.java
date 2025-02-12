/* An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
Given an integer n, return true if n is an ugly number.
Example 1:
Input: n = 6
Output: true
Explanation: 6 = 2 × 3
 * */

public class UglyNo {
	public static boolean isUgly(int n) {
		if(n<=0) return false;
		while(n%2==0) n /= 2;
		while(n%3==0) n /= 3;
		while(n%5==0) n /= 5;
		return n==1;
		
	}
public static void main(String[] args) {
	boolean a= isUgly(10);
	if(a==true) {
		System.out.println("This is an ugly No ");
	}
	else {
		System.out.println("This is not an Ugly no");
	}
}
}
