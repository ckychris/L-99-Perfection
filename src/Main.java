import java.util.ArrayList;

import solutions.*;

public class Main {

    private static ArrayList<String> list;
    private static ArrayList<String> list2;
    public Main() {

    }

    public static void main(String[] args) {
	// construct new list
	list = new ArrayList<String>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	list.add("F");
	list.add("G");
	list2 = new ArrayList<String>();
	list2.add("B");
	list2.add("A");
	list2.add("C");
	list2.add("C");
	list2.add("A");
	list2.add("B");
	// initiate new Algorithm
	Algorithm al = new Algorithm();
	System.out.println(al.toString());
	System.out.println("List 1 contains: ");
	// initiate new Time counter
	Time t = new Time();
	// output list item
	for (String i : list)
	    System.out.printf("%s", i);
	System.out.println();
	/* run most of our solutions.
	 * time counter implemented.
	 */
	//control(al, t);
	a1(al, t);
	a2(al, t);
	a2v2(al, t);
	a3(al, t, 3);
	a4(al, t);
	a5(al, t);
	a6(al, t);
    }
    public static void control(Algorithm al, Time t){
	t.start();
	for(int i=0;i<99;i++){}
	System.out.println("This is a control :" + "Nothing");
	System.out.println("Time passed after 100 rep: " + t.end()+ " ns\n");
    }
    public static void a1(Algorithm al, Time t){
	// P01 (*) Find the last box of a list.
	System.out.println("The last value of arrayList is: " + al.lastIndex(list));
    }
    public static void a2(Algorithm al, Time t){
	// P02 (*) Find the last but one box of a list.
	System.out.println("The last 2 value of arrayList is: " + al.last2Index(list).toString());
    }
    public static void a2v2(Algorithm al, Time t){
	// P02 (*) Find the last but one box of a list.
	System.out.println("The last 2 value of arrayList is: " + al.last2Index2(list).toString());
    }
    public static void a3(Algorithm al, Time t,int index){
	// P03 (*) Find the K'th element of a list.
	System.out.println("The value of index"+index+" in arrayList is: " + list.get(index-1));
    }
    public static void a4(Algorithm al, Time t){
	// P04 (*) Find the number of elements of a list.
	System.out.println("The number of elements in arrayList is: " + list.size());
    }
    public static void a5(Algorithm al, Time t){
	// P05 (*) Reverse a list.
	System.out.println("The reversed arrayList is: " + al.reverse(list));
    }
    
    public static void a6(Algorithm al, Time t){
	// P06 (*) Find out whether a list is a palindrome.
	System.out.println("List1 palindrome state is: " + al.palindrome(list));
	System.out.println("List2 palindrome state is: " + al.palindrome(list2));
    }
    
}
