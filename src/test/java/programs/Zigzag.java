package programs;

import org.testng.annotations.Test;

public class Zigzag {
	@Test
	public void zigzag()
	{
		int[] a= {10,20,30,80};
		int[] b= {40,50,60};
		int[] res=new int[a.length+b.length];
		int i=0;
		int k=0;
		while(i<a.length&&i<b.length)
		{
			res[k]=a[i];
			k++;
			res[k]=b[i];
			i++;
			k++;
			
		
		}
	while(i<a.length)
	{
		res[k]=a[i];
		i++;
		k++;
	}
	while(i<b.length)
	{
		res[k]=b[i];i++;k++;
	}
	for(int m=0;m<res.length;m++)
	{
		System.out.println(res[m]);
	}
	}

}
