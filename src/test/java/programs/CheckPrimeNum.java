package programs;

import org.testng.annotations.Test;

public class CheckPrimeNum {
	@Test
	public void primeOrNot()
	{
		int n=5;
		int i=2;int c=0;
		while(n>=i) {
			
			if(n%i==0)
			{
				c++;
			}
			
			i++;
		}
		if(c!=1&&n!=1)
			System.out.println("not prime number");
		else
			System.out.println("prime number");
	}
	
	@Test
	public void primeNum()
	{
		
		for(int i=1;i<=20;i++)
		{
			int n=i;
			int j=2;
			int c=0;
		while(j<=n/2)
			{
				if(n%j==0)
				{
					c++;
					break;
				
				}
				j++;
				
			}
			if(c==0&n!=1)
			{
				System.out.println(n);
			}
		
		}
	}
		@Test
		public void printNumbers()
		{
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
		}
	}
		@Test
		public void fibonacci()
		{
			int a=0;
			int b=1;
			System.out.println(a);
			System.out.println(b);
			for(int i=0;i<8;i++)
			{
				int sum=a+b;
				System.out.println(sum);
				a=b;
				b=sum;
				
			}
		}
}
