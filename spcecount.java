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
		String sr=s.nextLine();
	
		int len=0;
		int wordlen=0;
		len=sr.length();
		for(int i=0;i<len;i++)
		{
		if(sr.charAt(i)==' ')
		wordlen++;
		}
		System.out.println(wordlen);

	}
}
