package programs;

import org.testng.annotations.Test;

public class SortFirstMinimumNumArr {
@Test
public void sort()
{
	int a[]= {10,20,40,5};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=a[i];
			}
		}
		
	}
	System.out.println(a[0]);
}
}
