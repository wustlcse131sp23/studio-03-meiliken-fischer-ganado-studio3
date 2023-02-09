package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println ("What would you like n to be?");
		int n = in.nextInt ();
		
		boolean [] array = new boolean [n+1];
		
		
		for (int i=0; i< array.length; i++) 
		{ 
			array [i]=true;
			
		}
		
		for(int a=2; a<array.length/2; a++)
		{
			
			for(int b=a*2; b<array.length; b+=a)
			{
				array [a]=false;
				//System.out.println(b);
			}
		}
		
		for(int c=0; c<array.length;c++)
		{
			if (array[c]==true)
			{
				System.out.println(c);
			}
		}
		
		}
		
	}


