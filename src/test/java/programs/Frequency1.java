package programs;

import org.testng.annotations.Test;

public class Frequency1 {
@Test
public void frequency()
{
	int[] a= {1,1,12,23,60,12};
	boolean[] b=new boolean[a.length];
	for(int i=0;i<a.length;i++)
	{
		if(b[i]==false)
		{
		
		int c=1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				c++;
				b[j]=true;
			}
			}
		System.out.println(a[i]);
		}
		
	
	}
}

@Test
public void reverse1()
{
	String s="i am selenium";
	String s1=s.replace(" ","");
	int c=s1.length()-1;
	for(int i=0;i<s1.length();i++)
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
	String s="i am selenium";
	String res=" ";
	String[] s1 = s.split(" ");
for(int i=0;i<s1.length;i++)
	{
	char[] ch = s1[i].toCharArray();
		String rev=" ";
		for(int j=ch.length-1;j>=0;j--)
		{
			rev=rev+ch[j];
		}
		res=res+rev+" ";
	}
System.out.println(res);
}
}
