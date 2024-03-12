package programs;

import org.testng.annotations.Test;

public class Reverse3 {
	@Test
	public void reverse() {
		String s="o9#sol^ut#io$n&s";
		String s1=s.replace("[^0-9A-Za-z]", "");
		int c=s1.length()-1;
		for(int i=0;i<s.length();i++)
			
		{
			
			if(s.charAt(i)>='a'&&s.charAt(i)>='z'||s.charAt(i)>='A'&&s.charAt(i)>='Z'||s.charAt(i)>='0'&&s.charAt(i)>='9')
			{
				System.out.print(s1.charAt(c--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}

}
	@Test
	public void exmple3()
	{
		String s="hello hi how are you";
		String s1=s.replace(" ","");
		int c=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(s1.charAt(c--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
		
	}
	@Test
	public void exple4()
	{
		String s="hello hi how are you";
		String res=" ";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{String rev=" ";
			char[] ch = s1[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				rev=rev+ch[j];
			}
			res=res+rev;
		}
		System.out.println(res);
	}
}
