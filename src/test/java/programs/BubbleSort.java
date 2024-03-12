package programs;

import org.testng.annotations.Test;

public class BubbleSort {
	@Test
	public void sort()
	{
		int a[]= {4,0,1,2};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			System.out.println(a[i]);
		
		}
	}

}
