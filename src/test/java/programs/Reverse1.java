package programs;

import org.testng.annotations.Test;

public class Reverse1 {
	@Test
	public void reverse()
	{
		String s="aftab";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
	}
@Test
public void reverse1()
{
	String s="aftab";
	char[] ch = s.toCharArray();
	for(int i=ch.length-1;i>=0;i--)
	{
		System.out.print(ch[i]);
	}
}
@Test
public void reverse2()
{
	String s="aftab";
	char[] ch = s.toCharArray();int c=0;
	for(int i=0;i<ch.length;i++)
	{
		c++;
	}
for(int i=c-1;i>=0;i--)
{
	System.out.print(ch[i]);
}
	
	
}
@Test
public void reverse4()
{
	String s="hi";
	String rev=" ";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}
}
