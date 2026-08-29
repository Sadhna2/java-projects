package day12;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers num=new Numbers();
		Thread t1=new Thread(num);
		Thread t2=new Thread(num);
		Thread t3=new Thread(num);
		t1.setName("AA");
		t2.setName("BB");
		t3.setName("CC");
		t1.start();
		t2.start();
		t3.start();
	}

}
