package Day7;

import java.io.Serializable;

public class CardInfo implements Serializable {
	private static final long serialVersionUID=1L;
	private long cardNumber;
	private String name;
	private int cvv;
	private String expiryDate;
	public CardInfo(long cardNumber, String name, int cvv, String expiryDate) {
		
		this.cardNumber = cardNumber;
		this.name = name;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}
	
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
	    return "CardInfo{" +
	            "cardNumber=" + cardNumber +
	            ", name='" + name + '\'' +
	            ", cvv=" + cvv +
	            ", expiryDate='" + expiryDate + '\'' +
	            '}';
	}
	

}
