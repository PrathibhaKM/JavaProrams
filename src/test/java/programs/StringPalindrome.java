package programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class StringPalindrome {
	
@Test
public void pal()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String s=sc.next();
	char[] ch=s.toCharArray();
	String rev=" ";
	for(int i=ch.length-1;i>=0;i--)
	{
		rev=rev+ch[i];
	}
	System.out.println(rev);
	if(s.equals(rev))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
