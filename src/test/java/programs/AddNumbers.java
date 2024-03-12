package programs;

public class AddNumbers {
public static void main(String[] args) {
	String s="a10b21c4";
	int sum=0;
	int tsum=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		{
			int n=s.charAt(i)-48;
			tsum=tsum*10+n;
		}
		else
		{
			sum=sum+tsum;
			tsum=0;
		}
	}
	sum=sum+tsum;
	System.out.println(sum);
}
}
