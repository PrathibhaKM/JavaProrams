package programs;

import org.testng.annotations.Test;

public class DuplicateInt {
	@Test
	public void duplicate()
	{
		int[] a= {7,9,8,9,7,6,4};
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
if(c>1)

	System.out.println(a[i]+"-->"+c);
	}
		
	}
	}
	
}
