class Employee
{
	int id;
	String name;
	int salary;
	void sid(int i)
	{
		id=i;	
	}
	void nam(String n)
	{
		name=n;
	}
	void sal(int s)
	{
		salary=s;
	}
	void disp()
	{
		System.out.println("Id= "+id +"\n name= "+ name +"\n salary "+ salary);
	}
	public static void main(String args[])
	{
		Employee fn=new Employee();
		fn.sid(101);
		fn.nam("rp");
		fn.sal(100000);
		fn.disp(); 
	}
}
