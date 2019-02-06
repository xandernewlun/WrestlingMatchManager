package matchmanager;

import java.util.concurrent.TimeUnit;

public class Cthread implements Runnable{
	Main m = new Main();
	public void run() {

		try {
			TimeUnit.SECONDS.sleep(11);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.t.clockRunning = false;
	}

}