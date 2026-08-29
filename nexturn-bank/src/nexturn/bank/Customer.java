package nexturn.bank;

public class Customer {
     private int customerId;
     private String name;
     private String email;
     private long phone;
     private String address;
	 public Customer(int customerId, String name, String email, long phone, String address) {
		
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	 
	 public int getCustomerId() {
		 return customerId;
	 }
	 public void setCustomerId(int customerId) {
		 this.customerId = customerId;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 public long getPhone() {
		 return phone;
	 }
	 public void setPhone(long phone) {
		 this.phone = phone;
	 }
	 public String getAddress() {
		 return address;
	 }
	 public void setAddress(String address) {
		 this.address = address;
	 }
	 @Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", phone=" + phone
					+ ", address=" + address + "]";
		}
}
