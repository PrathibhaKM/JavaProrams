package programs;

import org.testng.annotations.Test;

public class SpaceAfterCharacter {
/*	@Test
	public void spaceAfterChar()
	{
		String s="tester";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
	System.out.print(ch[i]);
	for(int j=0;j<=i;j++)
	{
		System.out.print(" ");
	}
			
	}
	}
	@Test
	public void addNum()
	{
		String s="a1b2c3";
		char[] ch = s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				sum=sum+(ch[i]-48);
				
			}
		
		}
		System.out.println(sum);
	}*/
@Test
public void addNum1()
{
	String s="a11b2c3";
	char[] ch = s.toCharArray();
	int sum=0;
	String temp=" ";
	for(int i=0;i<ch.length-1;i++)
	{
		if(ch[i]>='0'&&ch[i]<='9')
		{
			if(ch[i]!='1'){
			sum=sum+(ch[i]-48);}
			else
			{
				 temp = temp+ch[i];
			}
			char[] temp1 = temp.toCharArray();
			sum=sum+(temp1[i]-48);
		}
			
		
	}
	System.out.println(sum);
}
}
