package programs;

import org.testng.annotations.Test;

public class RemoveDuplicates {
	/*@Test
	public void removeDuplicates()
	{
		String s="abcadffe";
		char[] ch=s.toCharArray();
		char[] a=new char[ch.length];
		int m=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]!=ch[j])
				{
					a[m]=ch[i];
					m++;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}*/
	@Test
	public void remDuplicate()
	{
		String s="abcadffe";
		char[] ch=s.toCharArray();
		boolean[] b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++)
		{if(b[i]==false) {
			int c=1;
		
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					b[j]=true;
				}
			}
			System.out.println(ch[i]);
		}
		}
		
	}

}
