import java.util.Scanner;

class Temp3
{
	public static void main(String args[]) 
	{
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter name");
		String name=myObj.nextLine();
		System.out.println("Enter marks in sub-1");
		float num1=myObj.nextFloat();
		System.out.println("Enter marks in sub-2");
		float num2=myObj.nextFloat();
		System.out.println("Enter marks in sub-3");
		float num3=myObj.nextFloat();
		System.out.println(name);
		System.out.println("sub-1="+num1);
		System.out.println("sub-2="+num2);
		System.out.println("sub-3="+num3);
		System.out.println("Total marks="+(num1+num2+num3));
		System.out.println("Total Average="+((num1+num2+num3)/3));
	}
}
	

