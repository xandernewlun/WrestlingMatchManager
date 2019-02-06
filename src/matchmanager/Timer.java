package matchmanager;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Timer {
	int [] green = {120, 120, 300};
	int [] red = {120, 120, 300};
	/*
	 * Timer class will consist of a timer, that can be called
	 * with a time. 
	 * Commands:
	 * Set Timer
	 * Start Timer
	 * Stop Timer
	 * Save Time In Slot 1, and start new Timer
	 */
	static int timeRemaining;
	static int startTime;
	static int timerCache1;
	static boolean clockRunning;
	static int min;
	static int sec;
	
	Scanner sc = new Scanner(System.in);
	static String command;
	public Timer() {
	}
	
	public static void time(int time) throws InterruptedException {
		clockRunning=true;
		startTime=time;
		
		for(timeRemaining=startTime;timeRemaining>=0;timeRemaining--) {
			if(clockRunning) {
				TimeUnit.SECONDS.sleep(1);
				sec2min();
				if(sec<10){
					System.out.println(min+":0"+sec);
				}else {
					System.out.println(min+":"+sec);
				}
			}else {
				break;
			}
		}
		if(timeRemaining<=0) {
			timeRemaining=0;
		}
		System.out.println("Time: " + timeRemaining);
	}
	
	public static void setTime(int t, int s, int gr) {
		//t is the time
		//s is the index for the timer
		//gr selects green or red (0=g, 1=r)
		
	}
	public static void changeTimer(String time) {
		
	}
	public static void sec2min(){
		min = timeRemaining/60;
		sec = timeRemaining%60;
	}	
}