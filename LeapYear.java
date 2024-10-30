import java.util.*;
public class LeapYear {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a year");
	int n = sc.nextInt();
	if(n%400 == 0) {
		System.out.println("This is a laeap year");
	}
	else if(n%100 == 0) {
		System.out.println("This is not a leap year");
	}
	else if(n%4 ==0) {
		System.out.println("This is a leap year");
	}
	else {
		System.out.println("This is not a leap year");
	}
}
}
