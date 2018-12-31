package javaprgms;

import bridgelabz.utility.utility;

public class Insertion
{
public static void main(String[] args)
{
System.out.println("enter the size of array");
int m=utility.getint();
int arr[]=new int[m];
		System.out.println("enter the values "+  m +" numbers");
		for(int i=0;i<m;i++)

  arr[i]=utility.getint();

utility.sort(arr);
for (int i = 0; i < m; i++)
{
    System.out.print(arr[i]+" ");            
}
System.out.println();                     

}
}



