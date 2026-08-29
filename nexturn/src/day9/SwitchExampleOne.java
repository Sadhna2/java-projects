package day9;

public class SwitchExampleOne {

	public static void main(String[] args) {
		int day =2;
		String week="";
		switch(day) {
		case 1-> week="Monday";
		case 2-> week="Tuesday";
		case 3-> week ="wednesday";
		case 4-> week ="Thursday";
		case 5-> week="Friday";
		case 6,7-> week="weekends";
		default-> week ="invalid week";
		}
		System.out.println(week);

	}

}
