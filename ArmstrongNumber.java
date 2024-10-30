/*An Armstrong number is a positive m-digit number that is equal to the sum of 
 * the mth powers of their digits. 
 * For Example : 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
 */

	import java.util.Scanner;  
	import java.lang.Math;  
	public class ArmstrongNumber {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Put a no");
			int num=sc.nextInt();
			int rem,temp,sum=0;
			temp=num;
			while(temp>0) {
				rem=temp%10;
				sum=sum+(rem*rem*rem);
				temp=temp/10;
				
			}
			if(num==sum) {
				System.out.println("Armstrong");
			}
			else {
				System.out.println("Not an armstrong");
			}
		}
	}
	
/* //Check a given no Armstrong or not
	import java.util.Arrays;
	import java.util.Scanner;

	public class Zpractice {

		static boolean isArmstrong(int n) {
			int r=0,digit=0,sum=0;
			int tmp=n;
			while(tmp>0) {
				tmp=tmp/10;
				digit++;
			}
				tmp=n;
			while(tmp>0) {
				r=tmp%10;
				sum+=Math.pow(r,digit);
				tmp=tmp/10;
			}
			if(n==sum)  return true;
			else return false;
		}
		
		public static void main(String[] args) {
	System.out.println("Enter a no");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(isArmstrong(n)) {
		System.out.println("Armstrong");
	}
	else System.out.println("Not");
	*/
	