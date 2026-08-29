package Day7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("F:\\nexturn2026\\Carddetails.data");
			ObjectInputStream ois = new ObjectInputStream(fis);) {
			Object obj;
				while((obj = ois.readObject())!= null) {
					CardInfo card = (CardInfo) obj;
					System.out.println(card);
				} 
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("eof reached");
		}
	}
}