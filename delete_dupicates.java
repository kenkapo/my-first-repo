import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String yo(String s,int n)
    {
        if (n==-1)
        {
            return "";
        }
        String m=yo(s,n-1);
        if (!m.contains(s.substring(n,n+1)))
        {
            return m+s.substring(n,n+1);
        }
        return m;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String sample="abbccda";
		//StringBuilder sb=new StringBuilder(h);
		System.out.println(yo(sample,sample.length()-1));
	}
}
//the output is "abcd";
