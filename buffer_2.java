import java.io.BufferedReader;
import java.io.InputStreamReader;

class Temp2
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String str=reader.readLine();
		System.out.println("Enter marks in sub-1");
		float num1=Integer.parseInt(reader.readLine());
		System.out.println("Enter marks in sub-2");
		float num2=Integer.parseInt(reader.readLine());
		System.out.println("Enter marks in sub-3");
		float num3=Integer.parseInt(reader.readLine());
		System.out.println(str);
		System.out.println("sub-1="+num1);
		System.out.println("sub-2="+num2);
		System.out.println("sub-3="+num3);
		System.out.println("Total marks="+(num1+num2+num3));
		System.out.println("Total Average="+((num1+num2+num3)/3));
	}
}
	

