package programs;

import org.testng.annotations.Test;

public class ToAppendAllZeroLast {
	@Test
	public void zeroLast()
	{
		int a[]= {0,5,0,0,4,9};
		int b[]=new int[a.length];
		int n=b.length-1;
		int m=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[m]=a[i];
				m++;
				
			}
			else
			{
				b[n]=a[i];
				n--;
			}
		}
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
	}

}
