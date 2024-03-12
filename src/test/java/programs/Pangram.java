package programs;

import org.testng.annotations.Test;

public class Pangram {

	@Test
	public void pangram()
	{
		String s1="abcdefghijklmnpqArstuvwxyzz";
	
		int[] a = frequency(s1);
		
		boolean res = check(a);
		if(res)
		{
			System.out.println("its a panagram");
		}
		else
		{
			System.out.println("not panagram");
		}




			}
			public static boolean check(int[] a)
			{
				for(int i=0;i<a.length;i++)
				{
					if(a[i]==0)
					{
						return false;
					}
				}
				return true;
			}
			public static int[] frequency(String s)
			{
				int[] a=new int[26];
				char[] ch = s.toCharArray();
				for(int i=0;i<ch.length;i++)
				{
					if(ch[i]>='a'&&ch[i]<='z')
					{
						a[ch[i]-97]++;
					}
					else if(ch[i]>='A'&&ch[i]<='Z')
					{
						a[ch[i]-65]++;
						
					}
				}
				return a;
				
			}

	@Test
	public void removeElement()
	{
		int[] a= {10,20,30,40};
		int[] b=new int[a.length-1];
	
		for(int i=0;i<b.length;i++)
		{
			if(i<2)
			{
			b[i]=a[i];
			
			}
			else
			{
				b[i]=a[i+1];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
@Test
public void add()
{
	int[] a= {10,20,40,50};
	int[] b=new int[a.length+1];
	int index=2;
	b[index]=30;
	for(int i=0;i<a.length;i++)
	{
		if(i<index)
		{
			b[i]=a[i];
		}
		else {
			b[i+1]=a[i];
		}
	}
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
	
}
@Test
public void zigzag()
{
	int[] a= {10,20,30};
	int[] b= {40,50,60};
	int[] res=new int[a.length+b.length];
	int i=0;
	int k=0;
	while(i<a.length&&i<b.length)
	{
		res[k]=a[i];
		i++;
		k++;
	}
while(i>a.length)
{
	res[k]=b[i];
	i++;
	k++;
}
while(i>b.length)
{
	res[k]=a[i];i++;k++;
}
for(int m=0;m<res.length;m++)
{
	System.out.println(res[m]);
}
}
}
