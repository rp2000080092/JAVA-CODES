class Palindrome
{
	public static void main(String args[])
	{
		
		int num=Integer.parseInt(args[0]);
		int num1=num;
		int re=0;
		while(num1!=0)
		{
			int rem=num1%10;
			re=re*10+rem;
			num1=num1/10;
		}
		if(num==re)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}