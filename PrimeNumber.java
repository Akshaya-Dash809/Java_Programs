import java.util.*;
public class PrimeNumber{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int count=0;
for(int i=1;i<=n;i++) {
	if(n%i==0) {
		count++;
	}
}
if(count==2) {
	System.out.println("Prime");
}
else {
	System.out.println("Not");
}
}
}


//Prime numbers from 1 to 100
//-------------------------------
//for(int i=1;i<=100;i++) {
//	int count=0;
//	for(int j=1;j<=i;j++) {
//		if(i%j==0) {
//			count++;
//		}
//	}
//	if(count==2) {
//		System.out.println(i);
//	}
//}
//
