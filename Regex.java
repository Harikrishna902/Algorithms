package oops;

import bridgelabz.utility;

public class Regex 
{
public static void main(String[] args)
{

	String name="Hello <<name>> \n" + "We have your full name as <<full name>> in our system \n"
			+ " your contact number is 91-xxxxxxxxxx \n"
			+ "Please,let us know in case of any clarification Thank you BridgeLabz \n" + " 01/01/2016 ";
			
			
		String[] patterns= {"<{2}\\w+>{2}","<{2}\\w+\\s\\w+>{2}","x{10}","\\d+[/]\\d+[/]\\d+"};
	System.out.println("enter the name");
	String name1=utility.getString();	
	System.out.println("enter the full name");
	String fname=utility.getString();
System.out.println("enter the phn number");
String phn=utility.getString();
System.out.println("enter the date");
String date=utility.getString();
String opname=name.replaceAll(patterns[0],name1);
String opfname=opname.replaceAll(patterns[1], fname);
String opphnno=opfname.replaceAll(patterns[2],phn);
String opdate=opphnno.replaceAll(patterns[3], date);
System.out.println(opdate);


}

}
