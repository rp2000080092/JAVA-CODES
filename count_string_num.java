import java.util.Scanner;
class Count_Num
{
	public static void main(String args[])
	{
		Scanner myobj=new Scanner(System.in);
		String str=myobj.nextLine();
		int co=0;
		int co2=0;
		int co3=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				co=co+1;
			}
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				co2=co2+1;
			}
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				co3=co3+1;
			}
			
		}
		System.out.println(co);
		System.out.println(co2);
		System.out.println(co3);
	}
}