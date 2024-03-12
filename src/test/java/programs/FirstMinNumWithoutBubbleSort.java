package programs;

import org.testng.annotations.Test;

public class FirstMinNumWithoutBubbleSort {
	@Test
	public void min()
	{
		int a[]= {11,20,5,80};
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println(min);
	}

}
