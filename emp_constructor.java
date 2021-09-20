class Emp_Constructor
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee(10);
		Employee e3=new Employee(11," rp ");
		Employee e4=new Employee(12," aa ",1200000);
		
	}
}

class Employee
{
	int id=-1;
	String name=" Na ";
	int salary=-1;
	Employee()
	{
		System.out.println(id + name + salary);
	}
	Employee(int s)
	{
		id=s;
		System.out.println(id + name + salary);
	}
	Employee(int s,String nam)
	{
		id=s;
		name=nam;
		System.out.println(id + name + salary);
	}
	Employee(int s,String nam,int sal)
	{
		id=s;
		name=nam;
		salary=sal;
		System.out.println(id + name + salary);
	}
	
}



