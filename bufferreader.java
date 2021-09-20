import java.io.BufferedReader;
import java.io.InputStreamReader;

class Temp
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String str=reader.readLine();
		int num1=Integer.parseInt(reader.readLine());
		int num2=Integer.parseInt(reader.readLine());
		System.out.println(str);
		System.out.println(num1+num2);
	}
}
	

