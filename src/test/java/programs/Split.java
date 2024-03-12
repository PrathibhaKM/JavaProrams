package programs;

import org.testng.annotations.Test;

public class Split {
/*	@Test
	public void count3()
	{
		String s="Test4Rya756ntzra1234";
		
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z')
{
	System.out.print(" ");
}
			else
			{ char s1=s.charAt(i);
				System.out.print(s1);
			
			}
		}
	
	}*/

/*	@Test 
  public void count4()
  {
		String s="Test4Rya756ntzra1234";
		String[] ch = s.split("[^0-9]");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}
		
  }*/
	@Test
	public void count5()
	{
		String s="Hi Hello Welcome";    
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
		String str=	s1[i];
		for(int j=str.length()-1;j>=0;j--)
		{
			System.out.print(str.charAt(j));
		}
		System.out.print(" ");
		
		}
	}
@Test
public void count6()
{
	String s="Hi Hello Welcome";
	String[] s1=s.split(" ");
	for(int i=s1.length-1;i>=0;i--)
	{
		System.out.print(s1[i]+" ");
	}
}

}
