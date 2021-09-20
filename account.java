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
	public static void main(String args[])
	{
		Account fn=new Account();
		fn.sal(1000);
		fn.sal(fn.disp()*2);
		System.out.println(fn.disp()); 
	}
}
