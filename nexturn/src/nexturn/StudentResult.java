package nexturn;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rno=1;
		int sub1=30;
		int sub2=95;
		int sub3=96;
		int total=sub1+sub2+sub3;
		float avg=total/3;
		System.out.println("total "+total);
		System.out.println("avg "+avg);
		System.out.println("rollno.= "+rno);
		if(sub1>=40 && sub2>=40 && sub3>=40 ) {
			
			System.out.println("student is pass in all subject");
			if(avg>60) {
	    	    System.out.println("student's grade is A");
	      }
	      else if (avg>50) {
	    	    System.out.println("student's grade is B");
	      }
	    	  else if(avg >40) {
	    		  System.out.println("student's grade is C");
	    	  }
	      
			
		}
		else
			
			if(sub1<40)
			   System.out.println("student is fail in sub1");
			else if(sub2<40)
				System.out.println("student is fail in sub2");
			else if(sub3<40)
				System.out.println("student is fail in sub3");
		   
      
	}

}
