import java.util.*;
public class IsEvenOdd {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	if(no%2==0) {
		System.out.println(no+" is an even no");
	}
	else {
		System.out.println(no+" is an odd no");
	}
}
}
