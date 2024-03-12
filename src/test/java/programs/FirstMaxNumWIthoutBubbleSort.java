package programs;

import org.testng.annotations.Test;

public class FirstMaxNumWIthoutBubbleSort {
	@Test
	public void max()
	{
		int a[]= {11,20,5,80};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		}

}
