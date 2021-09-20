class Employee_return
{
	int id;
	String name;
	int salary;
	int sid(int i)
	{
		return id=i;	
	}
	String nam(String n)
	{
		return name=n;
	}
	int sal(int s)
	{
		return salary=s;
	}
	void disp()
	{
		System.out.println("Id= "+id +"\n name= "+ name +"\n salary "+ salary);
	}
	public static void main(String args[])
	{
		Employee_return fn=new Employee_return();
		System.out.println(fn.sid(101));
		System.out.println(fn.nam("rp"));
		System.out.println(fn.sal(100000)); 
	}
}
