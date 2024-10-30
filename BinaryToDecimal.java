
public class BinaryToDecimal {
	public static int binToDec(int n) {
		int des_val=0;
		int base =1;
		int temp=n;
		while(temp>0) {
			int last_digit=temp%10;
			temp=temp/10;
			des_val=des_val+(last_digit*base);
			base = base*2;
		}
		return des_val;
	}
	
public static void main(String[] args) {
System.out.println(binToDec(100100));

}
}
