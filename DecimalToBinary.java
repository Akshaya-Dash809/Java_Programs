
public class DecimalToBinary {
public static void main(String[] args) {
	int num=36;
	String bin="";
	int tmp=num;
	while(tmp>0) {
		int r=tmp%2;
		tmp=tmp/2;
		bin=r+bin;
	}
	System.out.println("Binary equivalent of "+num+" is "+bin);
}
}
