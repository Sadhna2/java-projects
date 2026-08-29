package day12;
import java.util.Scanner;

public class BerthReservation implements Runnable {
    private int availableBerth = 10;
    Scanner sc = new Scanner(System.in);
    @Override
    public synchronized void run() {
        System.out.println( "Welcome " + Thread.currentThread().getName()+" Available Berths: " + availableBerth);
        if (availableBerth == 0) {
            System.out.println("Sorry " + Thread.currentThread().getName()+ ", no berths available");

        }
        else {
        	System.out.print("Enter required berths: ");
            int requiredBerth = sc.nextInt();
            if (requiredBerth <= availableBerth) {
                availableBerth = availableBerth - requiredBerth;
                System.out.println( requiredBerth + " berths allotted to "+ Thread.currentThread().getName());
            } 
            else {
                int allotted = availableBerth;
                availableBerth = 0;
                System.out.println("Only " + allotted + " berths available");
                System.out.println( allotted + " berths allotted to "+ Thread.currentThread().getName() );
            }
        }
    }
}