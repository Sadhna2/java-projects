package ppt;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex{    
public static void main(String args[]){    
//1st way    
Pattern p=Pattern.compile(".s");
Matcher m=p.matcher("ms");
boolean b=m.matches();
// 2nd method
boolean b2=Pattern.compile(".s").matcher("ms").matches();
// 3 way
boolean b3=Pattern.matches(".s", "ds");
}}    