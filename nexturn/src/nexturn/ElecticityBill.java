package nexturn;

public class ElecticityBill {

	public static void main(String[] args) {
		int serviceNumber=235;
		double previousUnits=350;
		double presentsUnits=800;
		double billAmount=0;
		double totalUnits=presentsUnits-previousUnits;
		char category;
		if(totalUnits<=100) category='A';
		else if(totalUnits<=200) category='B';
		else category ='C';
		
		switch(category) {
		case 'A': 
			if(totalUnits<=50)
				billAmount=totalUnits*1.45+25;
			else 
				billAmount=(50*1.45)+((totalUnits-50)*2.6)+30;
			break;
		case 'B':
			if(totalUnits<=100)
				billAmount=totalUnits*3.3+25;
			else
				billAmount=(100*3.3)+((totalUnits-100)*4.3)+50;
			break;
		case 'C':
			if(totalUnits<=200)
				billAmount=(totalUnits*5.00)+50;
			else if(totalUnits<=300)
				billAmount=(200*5) +((totalUnits-200)*7.2)+60;
			else if(totalUnits<=400)
				billAmount=(200*5)+(100*7.2)+((totalUnits-300)*8.5)+80;
			else if(totalUnits<=800)
				billAmount=(200*5)+(100*7.2)+(100*8.5)+((totalUnits-400)*9)+80;
			else 
				billAmount=(200*5)+(100*7.2)+(100*8.5)+(400*9)+((totalUnits-800)*9.5)+80;
				
		}  
		System.out.println("service number : "+serviceNumber);
		System.out.println("totalUnits : "+totalUnits);
		System.out.println("Bill Amount :"+billAmount);
	    
	
	}
	}


