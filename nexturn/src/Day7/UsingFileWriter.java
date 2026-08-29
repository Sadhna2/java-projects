package Day7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("F:\\nexturn2026\\resume.txt");
				BufferedWriter bw=new BufferedWriter(fw);){
			    bw.write("hello java");
			    bw.write("Spring");
			    bw.newLine();
			    bw.write("nexturn hyderabad");
			    System.out.println("created");
		} catch (IOException e) {
			System.err.println("errors");
			e.printStackTrace();
		}
				

	}

}
