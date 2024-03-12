package programs;

import org.testng.annotations.Test;

public class Pattern1 {
@Test
public void pattern()
{
	int n=5;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}
@Test
public void pattern1()
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}
/*@Test
public void pattern3()
{
	int n=5;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i>=j)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}*/
@Test
public void pattern4()
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=n;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
}
}
public void pattern5()
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
}
	
}
/*@Test
public void pattern6()
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<n;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print("* ");
		}
		System.out.println();
}
}*/
@Test
public void pattern7()
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=n;j++) {
		System.out.print("* ");
		}
		System.out.println();
}
}
@Test
public void pattern8()
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<n;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print("* ");
		}
		System.out.println();
}
}

}
