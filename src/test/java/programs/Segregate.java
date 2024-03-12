package programs;

import org.testng.annotations.Test;

public class Segregate {
	/*@Test
	public void seg()
	{
		String s="a^2c&d4";
		char[] ch = s.toCharArray();
		String temp=" ";
		String temp1=" ";
		String temp3=" ";
		for(int i=0;i<ch.length;i++)
		{
			if(s.charAt(i)>='a'&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{temp =temp+ s.charAt(i);
				
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
			temp1=temp1+s.charAt(i);
			}
			else
			{
				temp3=temp3+s.charAt(i);
			}
			
		}
		System.out.println(temp+temp1+temp3);
	}*/
@Test
public void sub()
{

	String[] a= {"a","ab","abcd","e","abcde"};  //a e   (bcz min length of string
	String min=a[0];
	for(int i=0;i<a.length;i++)
	{
		
		if(min.length()>a[i].length())
		{
			min=a[i];
		}
		
	}
	for(int i=0;i<a.length;i++)
	{
		if(min.length()==a[i].length()) {
			System.out.println(a[i]);
		}
	
	
	}
}
@Test
public void sub1()
{

	String[] a= {"a","ab","abcd","e","abcde"};  //a e   (bcz min length of string)
	String max=a[0];
	for(int i=0;i<a.length;i++)
	{
		
		if(max.length()<a[i].length())
		{
			max=a[i];
		}
		
	
	
	}
	System.out.println(max);
}
@Test
public void numMaxLength()
{

	String[] a= {"1","789","88","5","12345"};  //a e   (bcz min length of string)
	String max=a[0];
	for(int i=0;i<a.length;i++)
	{
		
		if(max.length()<a[i].length())
		{
			max=a[i];
		}
		
	
	
	}
	System.out.println(max);
}
}
