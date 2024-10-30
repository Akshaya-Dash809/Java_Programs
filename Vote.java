import java .util.Scanner;
public class Vote {
public static void main(String[] args) {
	

	// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter your age");
int age = sc.nextInt();
if(age>=18) {
	System.out.println("Eligible for vote");
}
else {
	System.out.println("Not eligible for vote");
}
}
}
