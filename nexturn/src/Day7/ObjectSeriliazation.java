package Day7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSeriliazation {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("F:\\nexturn2026\\carddetails.data");
				ObjectOutputStream oos=new ObjectOutputStream(fos);){
			    CardInfo card1=new CardInfo(12345678901234L,"nexturn",766,"10/23"); 
			    CardInfo card2=new CardInfo(21938213748L,"Nicmar",766,"10/26"); 
			    oos.writeObject(card1);
			    oos.writeObject(card2);
			    System.out.println("created");
		} 
		
		catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
