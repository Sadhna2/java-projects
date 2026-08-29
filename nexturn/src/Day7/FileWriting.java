package Day7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		File file=new File("F:\\nexturn2026");
		// file.mkdir();
		// System.out.println("CREATED");
		try (FileOutputStream fos=new FileOutputStream(file+"\\hello.txt");){
			
			for(char x='A';x<='Z';x++){
					fos.write(x);
			}
     //        fos.close();
             System.out.println("completed");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
		

}
