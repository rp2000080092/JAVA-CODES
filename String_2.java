public class String_2
{
	public static void main(String args[])
	{
		String s1="qwerty uiopas";
		String s2="qwerty uiopas";
		String s3=new String("hello");
		String s4=new String("Hello");

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		System.out.println(s3==s4);
		System.out.println("equal "+s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));

		System.out.println("compare to "+s1.compareTo(s2));
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s4));

		System.out.println("start with "+s1.startsWith("qwe"));
		System.out.println("end with "+s1.endsWith("sa"));

		System.out.println("index  "+s1.indexOf("uio"));
		System.out.println("index  "+s1.indexOf("uzio"));



	}
}
