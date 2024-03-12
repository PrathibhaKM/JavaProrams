package programs;

public class AddNum {

	public static void main(String[] args) {
String s="a10@b20%5";
String[] s1 = s.split("[^0-9]");
int sum=0;
for(int i=0;i<s1.length;i++) {
	if(s1[i]!="")

		sum=sum+Integer.parseInt(s1[i]);
}
System.out.print(sum);
	}

	}

