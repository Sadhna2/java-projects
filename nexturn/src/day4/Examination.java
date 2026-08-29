package day4;

public class Examination extends Student {

	public Examination(int regno, String stdName, String group,int sub1,int sub2,int sub3) {
		super(regno, stdName, group);
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		// TODO Auto-generated constructor stub
	}
	protected	int sub1;
	protected int sub2;
	protected int sub3;
	
	public void displayDetails () {
		int total =sub1+sub2+sub3;
		System.out.println(regno+" "+stdName+ " "+group+" "+total);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examination exam=new Examination (101,"nexturn","CSE",60,50,60);
		exam.displayDetails();
	    
		

	}

}
