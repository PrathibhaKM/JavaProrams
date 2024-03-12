package programs;

import org.testng.annotations.Test;

public class Prime {
	@Test
	public void prime()
	{
	int c=0;
	int n=6;
	int i=2;
	while(n>i)
	{
		if(n%i==0)
		{
			c++;
		}
		i++;
	}
	if(c==0&&n!=1)
	{
		System.out.println("prime");
	}
	else
	{
		System.out.println("not prime");
	}
	
	}
	@Test
	public void prime2()
	{
		int n=20;
		
		for(int i=1;i<n;i++)
		{int c=0;
		int j=2;
			while(i>j)
			{
			if(i%j==0)
			{
			c++;
			break;
			}
			j++;
			
			}
			if(c==0&&i!=1)
				System.out.println(i+" ");
		}
	}

}
