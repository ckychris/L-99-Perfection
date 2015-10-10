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
	newList.add(0, list.get(list.size()-1));
	newList.add(1, list.get(list.size()-2));
	return newList;
    }

}
