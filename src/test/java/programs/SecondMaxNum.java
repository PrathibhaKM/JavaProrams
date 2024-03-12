package programs;

public class SecondMaxNum {

	public static void main(String[] args) {
int[] a= {10,2,3,50,100};
int fmax=0;
int smax=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]>=fmax)
	{
		if(a[i]!=fmax)
		{
			smax=fmax;
			fmax=a[i];
		}
		else if(fmax==smax||a[i]>smax)
		{
			smax=a[i];
		}
		}
	
}
System.out.println(smax);
	}

}
