class First
{
	int a=0;
	void update(int value)
	{
		a=value;	
	}
	void disp()
	{
		System.out.println("value of a="+ a);
	}
	public static void main(String args[])
	{
		First fn=new First();
		System.out.println(fn.a);
		fn.update(10);
		fn.disp();
		
	}
}
