class Account
{
	int salary;
	void sal(int s)
	{
		salary=salary+s;
	}
	int  disp()
	{
		return salary;
	}
	int withdraw(int with)
	{
		if (with<salary && salary>5000)
		{
			salary=salary-with;
			if (salary>5000)
				return salary;
			else
				return -1;
		}
		
		else
		{
			System.out.println("not possible");
			return -1;
		}
	}
	public static void main(String args[])
	{
		Account fn=new Account();
		fn.sal(2000);
		fn.sal(fn.disp()*2);
		int c=fn.disp();
		System.out.println(c);
		System.out.println(fn.withdraw(2000)); 
	}
}
