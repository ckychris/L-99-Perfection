package solutions;

import java.util.ArrayList;

public class Algorithm {

    public Algorithm() {
	// TODO Auto-generated constructor stub
    }

    public String toString() {
	return "Algorithm builded.";
    }

    public String lastIndex(ArrayList<String> list) {
	return list.get(list.size()-1);
    }
    
    public ArrayList<String> last2Index(ArrayList<String> list){
	ArrayList<String> newList = new ArrayList<String>(2);
	java.util.ListIterator<String> i = list.listIterator(list.size()-2);
	newList.add(0, i.next());
	newList.add(1, i.next());
	return newList;
    }
    
    public ArrayList<String> last2Index2(ArrayList<String> list){
	ArrayList<String> newList = new ArrayList<String>(2);
	newList.add(list.get(list.size()-2));
	newList.add(list.get(list.size()-1));
	return newList;
    }
    
    public ArrayList<String> reverse(ArrayList<String> list){
	ArrayList<String> newList = new ArrayList<String>(list);
	int mid = list.size()/2;
	for(int i=0;i<mid;i++){
	    String temp = newList.get(i);
	    newList.set(i, newList.get(newList.size()-1-i));
	    newList.set(newList.size()-1-i, temp);
	}
	return newList;
    }
    
    public boolean palindrome(ArrayList<String> list){
	int mid = list.size()/2;
	for(int i=0;i<mid;i++){
	    if(!list.get(i).equals(list.get(list.size()-1-i)))
		return false;
	}
	return true;
    }

}
