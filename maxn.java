/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
				Scanner s=new Scanner(System.in);
		int[] a=new int[10];
		int i,j,max=0;
		for(i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<10;i++)
		{
		for(j=1;j<10;j++)
		{
			if(a[i]<=a[j])
			{
				a[i]=a[j];
			          max=a[i];
			}
		}
		}
		System.out.println(max);

	}
}
