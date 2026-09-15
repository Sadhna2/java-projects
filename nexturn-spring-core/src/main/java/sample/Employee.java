package sample;

public class Employee {

    private int code;
    private String name;
    private double salary;
    private Address address;

    	public Employee() {
			// TODO Auto-generated constructor stub
		}
    public Employee(int code, String name, double salary, Address address) {
		this.code = code;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void start() {
    	   System.out.println("this is called an init method");
    }
    public void stop() {
 	   System.out.println("this is called an destroy method");
 }
}