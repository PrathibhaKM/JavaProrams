package programs;

import org.testng.annotations.Test;

public class StringPrograms {
@Test
public void repeatedCharacters()
{
	String s="aababbc";
	char[] ch=s.toCharArray();
	
	for(int i=0;i<ch.length;i++)
	{
		int c=1;
		
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
				c++;
			while(c>1) {
				System.out.print(ch[i]);
			c--;
			}
				
			}
			else
			{
			
				System.out.println(ch[i]);
		
			}
		}
		System.out.println(ch[ch.length-1]);
		
	}
	
	
}

@Test
public void addTwoArr()
{
	int[] a= {4,5,7,3,2};
	int[] b= {2,3,4,1};
	int m=0;
	int[] c=new int[a.length];
	
	int i=0;
		while(i<a.length&&i<b.length) {
		c[m]=a[i]+b[i];
		m++;
		i++;
	}
	while(i<a.length)
	{
		c[m]=a[i];
		m++;
		i++;
	}
	
	
	for(int j=0;j<c.length;j++)
	{
		System.out.println(c[j]);
	}
}
@Test
public void numpattern1()
{
	int n=5;
	for(int i=1;i<=n;i++)
	{int k=1;
		for(int j=1;j<=i;j++)
		{
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
	}
}
@Test
public void numpattern2()
{
	int n=5;
	int k=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=n;j++)
		{
			System.out.print(k+" ");
			
		}
		k--;
		System.out.println();
	}
}
}

