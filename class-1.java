class Mainclass_1
{
	public static void main(String args[])
	{
		subClass sf=new subClass();
		subClass2 sf2=new subClass2();
		subClass3 sf3=new subClass3();
		sf.disp("my name is");
		sf2.disp2("rp");
		sf3.disp3("how are you?");
	}
}

class subClass
{
	String msg="hello ";
	String myname;
	void disp(String myname)
	{
		System.out.println(msg+myname);
		
	}
}

class subClass2
{
	
 	void disp2(String msg)
	{
		System.out.println(msg);
	}
}
class subClass3
{
	
	void disp3(String msg)
	{
		System.out.println(msg);
	}
}