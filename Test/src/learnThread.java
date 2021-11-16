

public class learnThread  implements Runnable{
	
	/*
	 * private String name;
	 * 
	 * 
	 * 
	 * public learnThread(String name) { this.name = name; }
	 * 
	 * 
	 * 
	 * private void messgae(int n) { System.out.println(name + "-" + n +" "); }
	 */

	public synchronized static void main(String[] args) {
	//new Thread(new learnThread("Wall")).start();
	//new Thread(new learnThread("gro")).start();
    Thread t = new Thread(new learnThread());
    t.run();
    t.run();
    t.start();
	
	}



	@Override
	public void run() {
		//messgae(1);messgae(2);
		System.out.println("runi");
	}
}
