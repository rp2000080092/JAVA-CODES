public class Sumofnumber
{
	public static void main(String args[])
	{

		int num=Integer.parseInt(args[0]);
		int sum1=0;
		while(num!=0)
		{
			int c=num%10;
			sum1=sum1+c;
			num=num/10;
		}

		System.out.println(sum1);
	}
}
