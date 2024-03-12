package programs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadNumberOfLines {

	public static void main(String[] args) throws IOException {
//FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop");
		String s="C:\\Users\\hp\\Desktop\\token.txt";

BufferedReader br=new BufferedReader(new FileReader(s));
int count=0;
while(br.readLine()!=null)
{
count++;
	}
System.out.println(count);
	}
}
