package programs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.checkerframework.checker.units.qual.h;
import org.testng.annotations.Test;

public class DuplicateConcurrent {
	/*@Test
	public void duplicate()
	{
		String s="aabbabb";
		int c=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1))
			{
				c++;
			}
			else
			{
				System.out.println(s.charAt(i)+" "+c);
				c=1;
			}
		}
		System.out.println(s.charAt(s.length()-1)+" "+c);
	}
	@Test
	public void numberOfVowels()
	{
		String s="Prathibha";
		char[] ch=s.toCharArray();
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				c++;
			}
		}
		System.out.println(c);
	}*/
	@Test
	public void notDuplicatevowel()             //no
	{
		String s="India";
		char[] ch=s.toCharArray();
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
		{
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]!=ch[j])
				{
				c++;
				}
			}
			
				}
			
	
	
	}
		System.out.println(c);
	}

	@Test
	public void removeDuplicate()
	{
		String s="India";
		s=s.toLowerCase();
		int c=0;
		char[] ch=s.toCharArray();
		LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++) {
		lh.add(ch[i]);
		
		}
		for(char h:lh)
		{
			if(h=='a'||h=='e'||h=='i'||h=='o'||h=='u'||h=='A'||h=='E'||h=='I'||h=='O'||h=='U')
			{
				c++;
			}
		}
		System.out.println(c);
	}
	@Test
	public void removeDuplicate1()
	{
		String s="India";
		s=s.toLowerCase();
		int c=0;
		char[] ch=s.toCharArray();
		LinkedHashMap< Character, Integer> lh=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			
			//lh.put(null, null)
		}
	}

	@Test
	public void lengthOfString()
	{String s="India";
	char[] ch=s.toCharArray();
	int c=0;
	for(char m:ch)
	{
		c++;
	}
	System.out.println("string length"+c);
		
	}

}
