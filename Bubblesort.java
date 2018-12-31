package javaprgms;

import bridgelabz.utility.utility;

public class Bubblesort 
{
	public static void main(String[] args)
	{
		
		System.out.println("enter the size of array");
		int n=utility.getint();	 
		int a1[]= new int [n];
		
		System.out.println("enter the values " + n + " numbers ");

		for(int d=0;d<=a1.length-1;d++)
			{
				a1[d]=utility.getint();   
			}
			utility.BubbleSort(a1);

	}
}
