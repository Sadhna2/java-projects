package day12;

public class PlatformThreadExample {

	public static void main(String[] args) {
		Thread thread = new Thread(()->{
			System.out.println("Running in platform thread");
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread());
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println("Task completed");
		});
		thread.start();
	}

}
