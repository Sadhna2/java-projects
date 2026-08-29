package Day3;

public class CommandLineArguments {
   public static void main(String[] args) {
	   int regno=Integer.parseInt(args[0]);
	  String stdName=args[1];
	  int s1=Integer.parseInt(args[2]); 
	  int s2=Integer.parseInt(args[3]); 
	  int s3=Integer.parseInt(args[4]); 
	  int total=s1+s2+s3;
	  System.out.println(regno+" "+stdName+" "+total);
   }
}
