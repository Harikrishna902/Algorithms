  package datastructures;

import java.util.Random;

import bridgelabz.utility;
public class tictac 
	{
		static int count=0;
		char a='x';
		char b='0';
		Random rd=new Random();
		char[][] arr=new char[3][3];
			public void display(){
			      for(int i=0;i<=arr.length-1;i++){
			      for(int j=0;j<=arr.length-1;j++){
			    		  System.out.print(arr[i][j]= '-');
			    	  }
		    	  System.out.println();
		    	  }
		      }
			public void display1(){
				for(int i=0;i<=arr.length-1;i++)
				{
					for(int j=0;j<=arr.length-1;j++)
					{
						System.out.print(arr[i][j]);
					}
					System.out.println();
				}
			}
			public void  computer(){
				int comprow=rd.nextInt(3);
				int compcol =rd.nextInt(3);
				if(arr[comprow][compcol]=='-')
				{
			arr[comprow][compcol]=a;
			return;
				}
				else
				{
					computer();
				}
				count++;
			}
			public void user(){
				System.out.println("enter the number of rows from 0-2");
		int userrow=utility.getint();
		System.out.println("enter the number of columns from 0-2");
		int usercol=utility.getint();
				if(arr[userrow][usercol]=='-')
				{
					arr[userrow][usercol]= b;
				}
				else
				{
			user();	
				}
				count--;
			}
			public void compwin(){
		if((arr[0][0]=='x'&&arr[0][1]=='x'&&arr[0][2]=='x')||(arr[1][0]=='x'&&arr[1][1]=='x'&&arr[1][2]=='x')||(arr[2][0]=='x'&&arr[2][1]=='x'&&arr[2][2]=='x')||(arr[0][0]=='x'&&arr[1][0]=='x'&&arr[2][0]=='x')||(arr[0][0]=='x'&&arr[1][0]=='x'&&arr[2][0]=='x')||(arr[0][1]=='x'&&arr[1][1]=='x'&&arr[2][1]=='x')||(arr[0][2]=='x'&&arr[1][2]=='x'&&arr[2][2]=='x')||(arr[0][0]=='x'&&arr[1][1]=='x'&&arr[2][2]=='x')||(arr[0][2]=='x'&&arr[1][1]=='x'&&arr[2][0]=='x'))
		{
		System.out.println("computer wins");
		System.exit(0);
		}
			}
		public void userwin(){																																		
		if((arr[0][0]=='0'&&arr[0][1]=='0'&&arr[0][2]=='0')||(arr[1][0]=='0'&&arr[1][1]=='0'&&arr[1][2]=='0')||(arr[2][0]=='0'&&arr[2][1]=='0'&&arr[2][2]=='0')||(arr[0][0]=='0'&&arr[1][0]=='0'&&arr[2][0]=='0')||(arr[0][0]=='0'&&arr[1][0]=='0'&&arr[2][0]=='0')||(arr[0][1]=='0'&&arr[1][1]=='0'&&arr[2][1]=='0')||(arr[0][2]=='0'&&arr[1][2]=='0'&&arr[2][2]=='0')||(arr[0][0]=='0'&&arr[1][1]=='0'&&arr[2][2]=='0')||(arr[0][2]=='0'&&arr[1][1]=='0'&&arr[2][0]=='0'))
		{
			System.out.println("user wins");
			System.exit(0);
		}
		}
			public static void main(String[] args){
		tictac obj=new tictac();
		obj.display();
		while(count<9)
		{
		System.out.println("its computer turn");
		obj.computer();
		obj.display1();
		obj.compwin();
		System.out.println("its time for user");
		obj.user();
		obj.userwin();
			}
		System.out.println("the game is draw");
		System.exit(0);
			}
	}

