package threads;

public class MainThread {

	public static void main(String[] args) {
		FirstThread f = new FirstThread();
		f.start();
		SecondThread s = new SecondThread();
		Thread t = new Thread(s);
		t.start();
		
	}

}
