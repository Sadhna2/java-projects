package day12;

public class Numbers implements Runnable {

	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=5;i++) {
			System.out.print(i+" ");
		}
	}

}
