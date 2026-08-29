package Day7;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

public class UsingFileReader {

	public static void main(String[] args) {
		try(FileReader fr=new FileReader("F:\\nexturn2026\\resume.txt");
				BufferedReader bw=new BufferedReader(fr);){
			    String str;
			    while((str=bw.readLine())!=null)
			    	     System.out.println(str);
			    System.out.println("done");
		} catch (IOException e) {
			System.err.println("errors");
			e.printStackTrace();
		} 
	}

}
