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
		int reversenum=0;
		 while( n!= 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + n%10;
          n= n/10;
      }

		while(reversenum>0)
		{
			int digit=reversenum%10;
			System.out.print(digit+" ");
			reversenum=reversenum/10;
		}
	}
}
