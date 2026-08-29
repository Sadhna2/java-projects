package day12;

public class ReservationMain {

	public static void main(String[] args) {
		BerthReservation berth=new BerthReservation();
		Thread t1=new Thread(berth);
		Thread t2=new Thread(berth);
		Thread t3=new Thread(berth);
		t1.setName("Nexturn");
		t2.setName("Nicmar");
		t3.setName("CC");
		t1.start();
		t2.start();
		t3.start();

	}

}
