package Day3;

public class CompletePayment {
	void payment_method(String upiId) {
		System.out.println("Enter upiId");
	}
	void payment_method() {
		System.out.println("cash on delivery");
	}
	void payment_method(int customerId,String bankName) {
		System.out.println("payment done using netbanking");
	}
	void payment_method(long accountNo,String expiryDate, int cvNo) {
		System.out.println("payment done using Card");
	}
	

}
