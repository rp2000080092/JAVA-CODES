class String_1
{
	public static void main(String args[])
	{
		String str1="Hello World";
		String str2= new String(" how are you");
		char[] helloarray={'h','e','l','l','o'};
		String hellostring= new String(helloarray);
		System.out.println(str1.concat(str2));
		System.out.println(str2.concat(str1));
		System.out.println(hellostring.length());
		System.out.println(str1.length());
		System.out.println(str2.length());
		str1=str1.concat(str2);
		System.out.println(str1);
	}
}
