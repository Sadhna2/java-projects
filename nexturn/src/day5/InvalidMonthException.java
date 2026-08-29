package day5;

public class InvalidMonthException extends RuntimeException {
    public InvalidMonthException() {
    	System.out.println("Month not found");
    	
    }
    public InvalidMonthException(String month) {
    	System.out.println("Month"+month +"not found");
    	
    }
}
