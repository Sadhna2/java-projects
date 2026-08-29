package day4;

public class LibraryDept extends Student {
	public LibraryDept() {
		bookDue=4;
	}
	 private int bookDue; 
//	public LibraryDept(int regno, String stdName, String group,int bookDue) {
//		super(regno, stdName, group);
//		this.bookDue=bookDue;
//		// TODO Auto-generated constructor stub
//	}
	
    
     public void display () {
 		
 		System.out.println("this is from sub class");
 	}
     public void show() {
    	  System.out.println("This is only from sub class");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std =new Student();
		std.display();
		
		std=new LibraryDept(); // object casting upcasting
		std.display();
	    // std.show(); // undefined for student
		LibraryDept info=new LibraryDept();
		info.display();
//		info= (LibraryDept) new Student(); // ClassCastException: class day4.Student
		//cannot be cast to class day4.LibraryDept
		//(day4.Student and day4.LibraryDept are in module nexturn of loader 'app')
	//	at nexturn/day4.LibraryDept.main
//		info.display();
//		info.show();
		
		 // Downcasting
	    LibraryDept info2 = (LibraryDept) std;

	    info.display();
	    info.show();
		
	}

}
