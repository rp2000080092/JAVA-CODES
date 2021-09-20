class Mainclass
{
	public static void main(String args[])
	{
		subClass sf=new subClass();
		subClass2 sf2=new subClass2();
		sf.disp();
		sf2.disp2();
	}
}

class subClass
{
	String msg="hello";
	void disp()
	{
		System.out.println(msg);
		subClass2 sf2=new subClass2();
		sf2.disp2();
	}
}

class subClass2
{
	String msg="how are";
	void disp2()
	{
		System.out.println(msg);
	}
}