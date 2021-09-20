class Prime
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int count=0;
		double c=Math.sqrt(num);

		for(int i=2;i<=c;i++)
		{
			if (num%i==0)
			{
				count=1;
				
			}
		}
		if(count==0)
			System.out.println("prime");
		else
			System.out.println("Not prime");
	}
}