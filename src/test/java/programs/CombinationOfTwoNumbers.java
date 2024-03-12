package programs;

import org.testng.annotations.Test;

public class CombinationOfTwoNumbers {
	@Test
	public void twonum()
	{
		int[] a= {7,4,3,8,2,5,9,6};
		int n=11;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				
				
			sum=a[i]+a[j];
			if(sum==n)
			{
				System.out.print(a[i]+" "+a[j]);
				System.out.println();
			}
				
				
			}
			
		}
	}

}
