package bridgelabz.utility;

import java.util.Scanner;

public class utility 
{
static Scanner sc=new Scanner(System.in);
public static int getint()
{
	return sc.nextInt();
	
}
public static double getdouble()
{
	return sc.nextInt();
	
}
public static int getInt()
{
	int intvalue=sc.nextInt();
	return intvalue;
}

public String getstring1()
{
	return sc.next();
	
}
public String getstringwords()
{
	return sc.nextLine();
	
}
public static float getfloat()
{
	return sc.nextLong();
	
}
public static byte getBytes() {
	return sc.nextByte();

} 


//Quadratic 
public static void roots(double a,double b,double c)
{
	double delt=((b*b)-(4*a*c));
	double root1=((-b+(Math.sqrt(delt))/4*a));
	double root2=((-b-(Math.sqrt(delt))/4*a));
	System.out.println("root1 equation" + root1);
	System.out.println("root2 equation" + root2 );
	
}

//windchil
public static double windchil(double t, double v)
{
	double w=35.74+0.6215+(0.4275*t-35.75)*Math.pow(v,0.16);
	return w;

}
//bubble sort
public static void BubbleSort(int a1[])
{
 int temp;
for(int c=1;c<=a1.length-1;c++)//sorting the array(outer  loop)
{
for(int i=0;i<=a1.length-2;i++)   //inner loop
{
	if(a1[i]>a1[i+1])
	{
		temp=a1[i];
		a1[i]=a1[i+1];
		a1[i+1]=temp;
	}
}
}

for(int j=0;j<=a1.length-1;j++)  
{
	System.out.print(a1[j]);//printing the sorted array   
	System.out.println();
}
}

//insertion sort
public static void sort( int arr[] )
{
   
    for (int i = 1; i< arr.length; i++) 
    {
        int j = i;

        int temp = arr[i];    

        while (j > 0 && temp < arr[j-1])
        {

            arr[j] = arr[j-1];

            j = j-1;

        }
        arr[j] = temp;            
    }        
} 



//tempcon

public static void celTofeh()
{
	System.out.println("enter c value");
	int c=utility.getint();
	int f=((c*9/5)+32);
	System.out.println("c------>f" + f);
	
}
	public static void fehTocel()
	{
			System.out.println("enter F value ");
			int F=utility.getint();
			int C=((F-32)*5/9);  
			System.out.println("c--> " + C);		
	}
	
		
	}






