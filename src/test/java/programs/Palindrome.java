package programs;

import org.testng.annotations.Test;

public class Palindrome {
	@Test
	public void pal()
	{String temp="";
	String s="nayan";
	char[] ch = s.toCharArray();
	for(int i=ch.length-1;i>=0;i--)
	{
		temp=temp+ch[i];
		
	}
	System.out.println(temp);
	if(s.equals(temp))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	
	}
	
	@Test
	public void palindrome2()
	{
		String s="nayan";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
	}
}
