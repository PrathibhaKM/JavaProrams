package programs;

public class Isometric {

	public static void main(String[] args) {
String s1="xxy";
String s2="aab";
char[] ch1 = isIsometric(s1);
char[] ch2 = isIsometric(s2);

	}

public static char[] isIsometric(String s) {
	char[] ch = s.toCharArray();
	int c=0;int m=0;
for(int i=0;i<s.length()-1;i++)
{
	
	if(ch[i]==ch[i+1])
	{
		c++;
	}
	else
	{
		m++;
	}

	
}
return ch;

	

}
}
