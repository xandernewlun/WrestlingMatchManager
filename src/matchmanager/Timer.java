package matchmanager;
import java.util.concurrent.TimeUnit;

public class Timer {
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
	public static void timer(int time) throws InterruptedException {
		startTime=time;
		for(timeRemaining=startTime;timeRemaining>=0;timeRemaining--) {
			if(clockRunning) {
				TimeUnit.SECONDS.sleep(1);
			}else {
				break;
			}
		}
		System.out.println("Time: " + timeRemaining);
	}
}
