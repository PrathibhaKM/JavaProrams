package programs;

import org.testng.annotations.Test;

public class SwapFirstAndLastWord {
	/*@Test
	public void swap() {
		String s="hi hello welcome to";
	String[] s1 = s.split(" ");
	String first = s1[0];
	String last=s1[s1.length-1];
	String temp=" ";
	for(int i=0;i<s1.length;i++)
	{
		if(s1[i]!=first&&s1[i]!=last)
		temp=temp+s1[i]+" ";
		
	}
	System.out.println(last+temp+first);
	}
	@Test
	public void swap1() {
		String s="hi hello welcome to";   //to reverse the string along with character
	String[] s1 = s.split(" ");
	
	for(int i=s1.length-1;i>=0;i--)
	{
		String st = s1[i];
	
		char[] ch = st.toCharArray();
		for(int j=ch.length-1;j>=0;j--)
		{
			System.out.print(ch[j]);
		}
		System.out.print(" ");
		
	}
	}
	@Test 
	public void reverse()
	{
		String s="hi hello welcome to";
		String s1=s.replace(" ", "");
		int j=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(s1.charAt(j--));
			}
			else
			{
				System.out.print(s.charAt(i));
		}
		}
	}*/
	/*@Test 
	public void perfectRotation()                          //no
	{
		String s="hi hello welcome to";
		String[] s1 = s.split(" ");
	String temp=" ";
		for(int i=0;i<s1.length;i++)
		{
			String first=s1[i];
			for(int j=0;j<s1.length;j++) {
			if(s1[i]!=first) {
			temp=temp+s1[i]+" ";
			
			
			}
			System.out.print(temp+first);
			
			}
			
		}}
		
		@Test
		public void rootate()
		{
			String s="Hello";
		char[] ch = s.toCharArray();
		String temp=" ";
		for(int i=0;i<ch.length;i++)
		{
			
			temp=temp+ch[i];
			System.out.println(temp);
		}
		
		
		
}*/
	/*	@Test
		public void pefectRotate()
		{
			String s="hi hello welcome to";
			 String[] s1 = s.split(" ");
			 			 for(int i=0;i<s1.length;i++)
			 {
				 String temp=s1[0];
				 for(int j=1;j<s1.length;j++)
				 {
					 s1[j-1]=s1[j];
					 System.out.print(s1[j-1]+" ");
				 }
				 System.out.print(s1[s1.length-1]=temp);
				 System.out.println();
			 }
			 
			
		}*/
	/*	@Test
		public void reverse()
		{
			String s="o9#sol^ut#io$n&s";
			char[] ch = s.toCharArray();
			for(int i=ch.length-1;i>=0;i--)
			{
				if(ch[i]>='0'&&ch[i]<='9'|| ch[i]>='a'&&ch[i]<='z')
				{
					System.out.print(ch[i]);
				}
				else
				{
					
					
				}
			}
		}
		@Test
		public void reverse1()
		{
			String s="o9#sol^ut#io$n&s";
			char[] ch = s.toCharArray();
			char[] c=new char[ch.length];
		
			for(int i=0;i<ch.length;i++)
				{
				if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='0'&&ch[i]<='9')
				{
					
				}
				else
				{
					c[i]=ch[i];
					c[c.length-1]--;
					
				}
			}
		
		}*/
		@Test 
		public void reverse4()
		{
			String s="o9#sol^ut#io$n&s";
			String s1 = s.replaceAll("[^0-9a-zA-Z","");
			int c=s1.length()-1;
			for(int i=0;i<s1.length();i++)
			{
				if(s.charAt(i)>='0'&&s.charAt(i)<='9'||s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
				{
				System.out.println(s1.charAt(c--));
				}
				else
				{
					System.out.println(s.charAt(i));
				}
			}
			
		}

}
