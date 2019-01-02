package javaprgms;

import bridgelabz.utility.utility;

public class MonthlyPayment
{
	public static void main(String[] args)
	{
System.out.println("enter the no of years");
	double year=utility.getint();
	System.out.println("enter the principle amount");
	double principle=utility.getint();
	System.out.println("enter the rate of interst");
	double rate=utility.getint();
utility.MonthlyPayment(principle, rate, year);
}
}