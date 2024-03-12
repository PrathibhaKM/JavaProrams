package programs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Reverse2 {
/*	@Test
	public void reverse()
	{
		String s="hi hello how are you";
		String s1 = s.replace(" ", "");
		int c=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(s1.charAt(c--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
	
	@Test
	public void reverse2()
	{
		String s="a!c!db&efg!m";
		String s1 = s.replace("[^a-zA-Z]", "");
				int c=s1.length()-1;
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)=='!'&&s.charAt(i)=='&')
					{
						System.out.print(s.charAt(i));
						
					}
					else
					{
						System.out.print(s1.charAt(c--));
					}
				}
		
	}
	@Test
	public void frequency()
	{
		String s="aabbcab";
		int c=1;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				c++;
			}
			else
			{
				System.out.print(ch[i]+""+c);
				c=1;
			}
			
		}
		System.out.println(ch[ch.length-1]+""+c);
		
	}*/
	@Test
	public void addZero()
	{
		String s="10110100";
	
		char[] ch = s.toCharArray();
		char[] ch1=new char[ch.length];
		int m=0;
		int k=ch1.length-1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='0')
			{
				ch1[m]=ch[i];
			m++;	
			}
			else
			{
				ch1[k]=ch[i];
				k--;
			}
		}
		for(int i=0;i<ch1.length;i++)
		{
			System.out.print(ch1[i]);
		}
		
	}
@Test
public void swap()
{
	String s1="hi";
	String s2="hello";
	s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println(s1);
	System.out.println(s2);
}
@Test
public void program()
{
	int[] a= {3,5,8,10,6,7,2};
	int min=a[0];
	int secondmin=min;
	for(int i=0;i<a.length;i++)
	{
		if(min>a[i])
		{
			min=a[i];
			
		}
		
	
	}
	System.out.println(min);
	
}
@Test
public void removeDuplicate() {
	String s="hellohi";
	s=s.toLowerCase();
	int c=0;
	LinkedHashSet<Character> l=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		
		l.add(s.charAt(i));
		
	}
	for(Character lh:l)
	{
		if(lh=='a'||lh=='e'||lh=='i'||lh=='o'||lh=='u')
		{
			c++;
		}
	}
	System.out.println(c);
}
}
