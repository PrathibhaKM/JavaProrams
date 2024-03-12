package programs;

public class Occurence {
	public static void main(String[] args) {
		String s="india";
		char[] ch = s.toCharArray();
		boolean[] b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++)
		{if(b[i]==false)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					b[j]=true;
				}
			}
			System.out.print(ch[i]+""+c);
		}
	}}

}
