package Day7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("f:\\nexturn2026\\hello.txt");
        		FileOutputStream fos=new FileOutputStream("F:\\nexturn2026\\copy.txt");) {
			int data;
			while((data=fis.read())!=-1)
				fos.write(data);			
		
         System.out.println("completed");
        }
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
