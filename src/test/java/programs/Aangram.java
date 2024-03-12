package programs;

public class Aangram {

	public static void main(String[] args) {
String s1="care";
String s2="racee";
int[] a = frequency(s1);
int[] b=frequency(s2);
boolean res = check(a,b);
if(res)
{
	System.out.println("its a anagram");
}
else
{
	System.out.println("not anagram");
}




	}
	public static boolean check(int[] a,int[] b)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				return false;
			}
		}
		return true;
	}
	public static int[] frequency(String s)
	{
		int[] a=new int[26];
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				a[ch[i]-97]++;
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
			{
				a[ch[i]-65]++;
				
			}
		}
		return a;
		
	}

}
