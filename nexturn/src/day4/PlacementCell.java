package day4;

public class PlacementCell extends Examination{

	public PlacementCell(int regno, String stdName, String group, int sub1, int sub2, int sub3,boolean backlogs) {
		super(regno, stdName, group, sub1, sub2, sub3);
		// TODO Auto-generated constructor stub
		this.backlogs=backlogs;
	}
	private boolean backlogs;
	public double avg_marks() {
		return(sub1+sub2+sub3)/3;
	}
	public void displayResult() {
		if(backlogs==false && avg_marks()>=60 ) {
			System.out.println("Selected");
		}
		else System.out.println("not Selected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlacementCell placed=new PlacementCell (101,"nexturn","CSE",80,50,60,false);
		placed.displayDetails();
		System.out.println("avg_marks="+placed.avg_marks());
		placed.displayResult();
		
		
		
	}

}
