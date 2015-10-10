package solutions;

import java.util.Date;

public class Time {

    private long startTime;
    
    public Time() {
	// TODO Auto-generated constructor stub
    }
    
    public void start(){
	startTime = System.nanoTime();
    }
    
    public long end(){
	return System.nanoTime() - startTime;
    }

}
