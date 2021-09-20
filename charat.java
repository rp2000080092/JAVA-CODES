import java.util.Scanner;
class Char_At
{
	public static void main(String args[])
	{
		Scanner myobj=new Scanner(System.in);
		String str=myobj.nextLine();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i)+".");
		}
	}
}