package Day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

	public static void main(String[] args) {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the code name salary");
		try {
			int code=Integer.parseInt(br.readLine());
			String name=br.readLine();
		     double sal=Double.parseDouble(br.readLine());
		     System.out.println(code+" "+name+" "+sal);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
