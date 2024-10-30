
public class OddEvenInANumber {
	public static void main(String args[]){  
		int num= 123456;
		char a[] = String.valueOf(num).toCharArray();
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length-1;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length-1;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
		}  
		}  
		}}  