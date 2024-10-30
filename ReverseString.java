
//public class ReverseString {
//public static void main(String[] args) {
//	String str= "Akshaya";
//	StringBuffer sb = new StringBuffer(str);
//	System.out.println("The Reverse String is "+ sb.reverse());
//}
//}

public class ReverseString{
	public static String strRev(String str) { //create method of reverse string
		char ch[]=str.toCharArray(); //convert string into char array
		String rev=" "; //create a empty string variable
		for(int i=ch.length-1;i>=0;i--) { //retrieve all character from backward
			rev += ch[i]; //store the looping chars in an empty string
		}
		return rev; //return rev string
	}
	public static void main(String[] args) { //main method
		System.out.println(strRev("Akshaya")); //calling of rev method by passing a string
	}
}
