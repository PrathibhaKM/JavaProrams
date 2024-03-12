package programs;

public class Reverse5 {
	public static void main(String[] args) {
		
	String s="Hi How r u";
	String s1 = s.replace(" ", "");
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

}
