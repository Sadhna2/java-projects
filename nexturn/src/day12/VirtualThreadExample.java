package day12;

public class VirtualThreadExample {

	public static void main(String[] args) throws Exception {
		Thread thread = Thread.startVirtualThread(()->{
			System.out.println("Running in virtual thread");
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread());
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println("Task completed");
		});
		thread.join();

	}

}
