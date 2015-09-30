import java.util.ArrayList;

import solutions.*;

public class Main {

    private static ArrayList<String> list;

    public Main() {

    }

    public static void main(String[] args) {
	// construct new list
	list = new ArrayList<String>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	// initiate new Algorithm
	Algorithm al = new Algorithm();
	System.out.println(al.toString());
	System.out.println();
	// output list item
	for (String i : list)
	    System.out.printf("%s ", i);
	System.out.println();
	// 1-99
	System.out.println("This last index of arrayList is: " + al.lastIndex(list));
    }

}
