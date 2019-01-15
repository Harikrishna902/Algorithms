package datastructures;

import bridgelabz.utility;

public class permutation 
{
	
	public class Permutation 
	{ 
		public void main(String[] args) 
		{
			System.out.println("enter the string");
			String str = utility.getString();
			int n = str.length(); 
			Permutation permutation = new Permutation(); 
			permutation.permute(str, 0, n-1); 
		} 

		private void permute(String str, int start, int end) 
		{ 
			if (start == end) 
				System.out.println(str); 
			else
			{ 
				for (int i = start; i <= end; i++) 
				{ 
					str = swap(str,start,i); 
					permute(str, start+1, end); 
					str = swap(str,start,i); 
				} 
			} 
		} 

		
		public String swap(String a, int i, int j) 
		{ 
			char temp; 
			char[] charArray = a.toCharArray(); 
			temp = charArray[i] ; 
			charArray[i] = charArray[j]; 
			charArray[j] = temp; 
			return String.valueOf(charArray); 
		} 

	}
}
	
