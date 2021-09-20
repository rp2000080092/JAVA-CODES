class Main_Constructor
{
	public static void main(String args[])
	{
		Constructor c1=new Constructor();
		Constructor c2=new Constructor(100);
		
	}
}

class Constructor
{
	Constructor()
	{
		System.out.println("default");
	}
	Constructor2(int a)
	{
		System.out.println(a);
	}
}

