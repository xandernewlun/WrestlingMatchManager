package matchmanager;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main{
	static AtomicInteger value = new AtomicInteger(10);
	static Timer t = new Timer();
	public Main() {
		
	}
	

	/*
	 * All the data from all classes converge here.
	 * Threads will run the Timer, and Match Sections.
	 * Text Driven
	 */
	
	public static void main(String[] args) throws InterruptedException{
		new Thread(new Cthread()).start();
		new Thread(new Tthread()).start();
	}
}