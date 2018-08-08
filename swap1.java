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
		int n=s.nextInt();
		int m=s.nextInt();
		if(n<m)
		{
			int temp=n;
			n=m;
			m=temp;
		}
		System.out.println(n+" "+m);

	}
}
