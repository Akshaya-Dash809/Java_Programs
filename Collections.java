import java.util.ArrayList;

public class Collections {

public static void main(String[] args) {
	ArrayList<String> courses=new ArrayList<>();
	//Add elements
	courses.add("Java");
	courses.add("Python");
	courses.add("AWS");
	courses.add("C++");
	System.out.println(courses);
	//Clone/Copy elements
	courses.clone();
	System.out.println(courses);
	//Access elements
	String s1=courses.get(0);
	System.out.println(s1);
    //Remove elements
	courses.remove("Java");
	courses.remove(1);
	System.out.println(courses);
	//Change/set elements
	courses.set(1, "DotNet"); //set(1,s1)
	System.out.println(courses);
	
	
}	

}
