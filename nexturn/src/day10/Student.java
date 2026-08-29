package day10;

public class Student {
    private int  regNo;
    private String name;
    private String email;
    
	public Student(int regNo, String name, String email) {
		this.regNo = regNo;
		this.name = name;
		this.email = email;
	}
	public int getRegNo() {
		return regNo;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
}
