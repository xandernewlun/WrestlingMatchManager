package matchmanager;

public class Tthread implements Runnable{
	Main m = new Main();
	public void run() {
		try {
			m.t.time(75);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}