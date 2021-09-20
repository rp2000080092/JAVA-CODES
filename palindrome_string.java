import java.util.Scanner;
class Palindrome_String
{
	public static void main(String args[])
	{
		Scanner myObj=new Scanner(System.in);
		String str=myObj.nextLine();
		int k=str.length();

		char[] c=str.toCharArray();
		char[] b= new char[k];

		int j=0;
		for(int i=k-1;i>=0;i--)
		{
			b[j]=c[i];
			j=j+1;	
		}
		String s3=new String(b);
		System.out.println(str.equals(s3));
	}
}