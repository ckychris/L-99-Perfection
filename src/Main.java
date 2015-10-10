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
	System.out.println("This list contains: ");
	// initiate new Time counter
	Time t = new Time();
	// output list item
	for (String i : list)
	    System.out.printf("%s", i);
	System.out.println();
	control(al, t);
	a1(al, t);
	a2(al, t);
	a2v2(al, t);
    }
    public static void control(Algorithm al, Time t){
	t.start();
	for(int i=0;i<99;i++){}
	System.out.println("This is a control :" + "Nothing");
	System.out.println("Time passed after 100 rep: " + t.end()+ " ns\n");
    }
    public static void a1(Algorithm al, Time t){
	// P01 (*) Find the last box of a list.
	t.start();
	for(int i=0;i<99;i++){
	    al.lastIndex(list);
	}
	System.out.println("This last index of arrayList is: " + al.lastIndex(list));
	System.out.println("Time passed after 100 rep: " + t.end()+ " ns\n");
    }
    public static void a2(Algorithm al, Time t){
	// P02 (*) Find the last but one box of a list.
	t.start();
	for(int i=0;i<99;i++){
	    al.last2Index(list);
	}
	System.out.println("This last 2 index of arrayList is: " + al.last2Index(list).toString());
	System.out.println("Time passed after 100 rep: " + t.end()+ " ns\n");
    }
    public static void a2v2(Algorithm al, Time t){
	// P02 (*) Find the last but one box of a list.
	t.start();
	for(int i=0;i<99;i++){
	    al.last2Index2(list);
	}
	System.out.println("This last 2 index of arrayList is: " + al.last2Index2(list).toString());
	System.out.println("Time passed after 100 rep: " + t.end()+ " ns\n");
    }
}
