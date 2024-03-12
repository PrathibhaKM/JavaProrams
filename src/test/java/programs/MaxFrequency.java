package programs;

import org.testng.annotations.Test;

public class MaxFrequency {
	@Test
	public void max()
	{
		int a[]= {0,10,5,5,55,5,10,10,10};
		int max=0;
		int val=0;
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) {
					c++;
				}
				
			}
			if(c>max)
			{
				max=c;
				val=a[i];
			}
			//System.out.println(a[i]+" -->"+c);
		}
		System.out.println(val+"-->"+max);
	}

}
