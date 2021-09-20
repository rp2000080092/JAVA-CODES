class String_4
{
	public static void main(String args[])
	{
		String str="hi helhow";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				System.out.println((int)(ch-'a')+1);
			}
			else if(ch>='A' && ch<='Z')
			{
				System.out.println((int)(ch-'A')+1);
			}
		}
	}
}