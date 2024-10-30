import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayElements {

	public static void main(String[] args) {
		String a[]= {"Asdf","JHGFd","hgfd","hgfds"};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Reverse of String Array : "+Arrays.toString(a));
	}
}
