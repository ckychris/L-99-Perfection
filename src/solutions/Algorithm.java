package solutions;

import java.util.ArrayList;

public class Algorithm {

    public Algorithm() {
	// TODO Auto-generated constructor stub
    }

    public String toString() {
	return "Algorithm builded.";
    }

    // P01 (*) Find the last box of a list.
    public String lastIndex(ArrayList<String> list) {
	return list.get(list.size()-1);
    }

}
