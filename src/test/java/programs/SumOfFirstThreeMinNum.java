package programs;

import org.testng.annotations.Test;

public class SumOfFirstThreeMinNum {
@Test
public void sumOfThreeMin()
{
	int a[]= {22,10,30,66,70};
int sum=0;
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

		

	}
	for(int i=0;i<a.length;i++)
	{
		if(i<3)
			sum=sum+a[i];
	}
	System.out.println(sum);
}

}
