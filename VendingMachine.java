package javaprgms;

import bridgelabz.utility.utility;

public class VendingMachine 
{
static int i=0;
static int total=0;
static int []notes= {1000,500,100,50,20,10,2,1 };
static int money;
public static int calculate(int money,int[]notes)
{
	int r;
	if(money==0)
	{
		     return-1;
		     
	}
	else
	{
		if(money>=notes[i])
		{
			int calnotes=money/notes[i];
			r=money%notes[i];
			money=r;
			total=total+calnotes;
			System.out.println(notes[i] + " Notes " + calnotes);			
		}
		i++;
		return calculate(money,notes);
	}
}
public static void main(String[] args)
{	
System.out.println("enter the amount ");
 money=utility.getint();
 VendingMachine.calculate(money, notes);
 System.out.println("total no of notes are " + total);
}
}

