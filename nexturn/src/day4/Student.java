package day4;

public class Student {
  protected int regno;
  protected String stdName;
  protected String group;
  protected Student() {
	  
  }
  protected Student(int regno, String stdName, String group) {
	
	this.regno = regno;
	this.stdName = stdName;
	this.group = group;
  }
  public void display() {
	  System.out.println("this is from super class");
  }
  public int getRegno() {
	return regno;
  }
  public void setRegno(int regno) {
	this.regno = regno;
  }
  public String getStdName() {
	return stdName;
  }
  public void setStdName(String stdName) {
	this.stdName = stdName;
  }
  public String getGroup() {
	return group;
  }
  public void setGroup(String group) {
	this.group = group;
  }
  
  
}
