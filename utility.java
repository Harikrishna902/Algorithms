package bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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

public static String getString() 
{
	String str = sc.nextLine();
	return str;
}   

public String getstring()
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
	//sqrt
	public static double sqrtNewton(double c)
	{
		double  t=c;
		double epsilon=1e-15;
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t+t)/2.0;
			
		}
		System.out.println(t);
		return 0.0;
		
	}
	//monthlypayment
	public static double MonthlyPayment(double principle,double rate,double year)
	{
		double r=rate/(12*100);
		double  num=(principle*r);
		double n=12*year;
		double delta=(1-(Math.pow(1+r,-n)));
		double payment=(num/delta);
		System.out.println("payment of the month " +payment);
		return 0.0;
		}
	//dayof week
	
	
	
	
public static void dayOfWeek(int year,int month,int day)
{
	 if((month>=1&& month<=12)&&(day>=0 &&day<=31))
	 {
		 int y0=year-(14-month)/12;         
			int x=y0+y0/4-y0/100+y0/400;
			int m0=month+12*((14-month)/12)-2;
			int d0=(day+x+31*m0/12)%7;
		 System.out.println("day of week " +d0);
		 switch(d0)
		 {
		 case 0:
			 System.out.println(d0 +" sunday");
			 break;
		 case 1:
			 System.out.println(d0  +"  monday");
			 break;
		 case 2:
			 System.out.println(d0 +" tuesday");
			 break;
			 
		 case 3:
			 System.out.println(d0 +" wednesday");
			 break;
			 
		 case 4:
			 System.out.println(d0 + " Thursday");
			 break;
			 
		 case 5:
			 System.out.println(d0 + " Friday");
			 break;
		 case 6:
			 System.out.println(d0 + " Saturday");
			 break;
			 		 }
	 }
	 else
	 {
		 System.out.println("invalid month or day number");
	 }
}

//readstring

	 public static String[] readStringFile(String path,String divide) {
			List<String> wordList = new ArrayList<String>();
			String line;
			String list[];
			try {
				InputStream iS = new FileInputStream(path); //reads in byte
				InputStreamReader iSR = new InputStreamReader(iS);//byte stream to character stream
				BufferedReader bs = new BufferedReader(iSR);//reads character stream
				while((line=bs.readLine())!=null) {
					String words[] = line.split(divide);
					for(String wordStr :words) {
					wordList.add(wordStr);
					}
				}
				bs.close();
				
				
		
			} catch (Exception e) {
				System.out.println(e);
			}
			list = wordList.toArray(new String[wordList.size()]);
			return list;
		}
	 
	 //binary searchfile
		
		public static int binarySearchFile(String[] str,String key) {
				return search(str, 0, str.length-1, key);
		}		
		public static int search(String str[],int start,int end,String key) {
			if((start-end) == 0) {
				if(str[start].compareTo(key)==0) {
					return start;
				}
				return -1;
			}else {
				int mid = (start+end)/2;
				if(str[mid].compareTo(key)==0) {
					return mid;
				}else {
					if(key.compareTo(str[mid])>0) {
						return search(str, mid+1, end, key);
					}else {
						return search(str, start, mid, key);
					}
				}
			}
		}
		
		
		//findNumber
		
		public static int findNumber(int arr[],int start,int end) {

				if((start - end) ==0)
				{
					return arr[start];
				}
				else 
				{	
					int mid = (start +end)/2;
					if(arr[start]==mid)
					{
						System.out.println("Number is "+start);
					}
					else 
					{
						System.out.println("number present between"+start+" and "+mid+"?");
					}
						char answer = utility.getString().charAt(0);
						if(answer =='n'||answer=='N')
						{
							return findNumber(arr, mid+1, end);
						}
						else 
						{
							return findNumber(arr, start, mid);
						}
				}
		}
		//linear sort
		
		public static String[] sortLinear(String[] str) {
			for(int i=1;i<str.length;i++) {
					String key = str[i];
					int j= i-1;
					while(j>=0) {
					if((key.compareTo(str[j]))>0) {
						break;
					 }
					str[j+1] = str[j];
					j--;
					}
					str[j+1] = key;
				}
			return str;
		}
		
		
		//input file 
		public static int[] readIntFile(String path,String split) {
			String line;
			String words[];
			String wordIntList[];
			List<String> ls = new ArrayList<>();
			try
			{
				
				FileInputStream fis = new FileInputStream(path);
				InputStreamReader isr = new InputStreamReader(fis);
				@SuppressWarnings("resource")
				BufferedReader br = new BufferedReader(isr);
				                                                                                                                              
					
				
				while((line=br.readLine())!=null);
				
				{
					words =line.split(split);
					for(String wordInt:words)
					{
						ls.add(wordInt);
					}
				}
			}
			
			catch (Exception e)
			{
				System.out.println(e);
			}
			
			wordIntList = ls.toArray(new String[ls.size()]);
			int wordIntArr[] = new int[wordIntList.length];
			
			for(int i=0;i<wordIntArr.length;i++) {
				wordIntArr[i] = Integer.parseInt(wordIntList[i]);
			}
			
			return wordIntArr;
		}
		
		
		//bubblesort file
		public static int[] bubbleSortFile(int[] wordsInt) {
			
			
			for(int i=0;i<wordsInt.length;i++) {
				for(int j=i+1;j<wordsInt.length;j++) {
					if(wordsInt[i]>wordsInt[j]) {
						int temp = wordsInt[i];
						wordsInt[i] = wordsInt[j];
						wordsInt[j] = temp;
					}
				}
			}
			return wordsInt;
		}

	

//binaryconverstion
public static void toBinary(int n)
{
	
	String result="";
	String result1="";
	
 while(n>=1)
	{
	 int r=n%2;
	 result=result+r;
	 n=n/2;
	}
 for(int i=result.length()-1;i>=0;i--)
 {
	 char a=result.charAt(i);
	 result1=result1+a;
 }
 System.out.println("converted binary value is:"+ result1);
 {
 int p=0;
 double sum=0.0;

  String []s=result1.split("");
  for(int i=s.length-1;i>=0;i--)
  {
 	 double power=Math.pow(2, p);
 	 int k=Integer.parseInt(s[i]);
 	 sum=sum+(power*k);
 	 p++;
  }
  System.out.println(sum);
 	}
 }

//nibble the binary number
public static void toBinary1()
{
	System.out.println("enter decimal number");
	int number =utility.getint();
	int temp = number;
	int rem;
	String result = "" ;
	int decimal = 0;
	while(number>=1)
	{
		rem = number%2;
		result = rem+result;
		number = number/2;
	}
	result = 0+result;
	//System.out.println(result);
	String nibble1 = result.substring(0,4);
	//System.out.println(nibble1);
	String nibble2 = result.substring(4);
	//System.out.println(nibble2);
	String newBinary = nibble2.concat(nibble1);
	//System.out.println(newBinary);
	int index = 0;
	int sum = 0;
	for(int i=newBinary.length()-1;i>=0;i--)
	{
		char j = newBinary.charAt(index);
		index++;
		int num = Character.getNumericValue(j);
		sum = (int) (num*Math.pow(2, i)+sum);
		
	}
	System.out.println(sum);
}
	
	}



























	











		
		
		


















