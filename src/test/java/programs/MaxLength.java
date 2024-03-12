package programs;

public class MaxLength {
	public static void main(String[] args) {
		String s="abcdaadx";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String s1 = s.substring(i, j);
				if(s1.length()==4)
				{
					String rev="";
					for(int k=s1.length()-1;k>=0;k--)
					{
						rev+=s1.charAt(k);
					}
					if(rev.equals(s1))
					{
						System.out.println(rev);
					}
				}
				
				
			}
		}
	}
}
