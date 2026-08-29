package Day7;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis=new FileInputStream("f:\\nexturn2026\\hello.txt");) {
			
			int data;
			while((data=fis.read())!=-1)
				System.out.print((char)data+" ");
			//fis.close();
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
