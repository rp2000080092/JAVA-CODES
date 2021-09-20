class SumofArray
{
	public static void main(String args[])
	{
		int[] source= new int[10];
		int len=args.length;
		for(int i=0;i<len;i++)
		{
			int x=Integer.parseInt(args[i]);
			source[i]=x;
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(source[i]);
		}
		int sum=0;
		int avg=0;
		for(int i=0;i<len;i++)
			sum=sum+source[i];
		System.out.println("sum="+sum);
		System.out.println("avg="+(sum/(float)len));
		int max=-123;
		for(int i=0;i<len;i++)
		{
			if(source[i]>max)
				max=source[i];
		}
		System.out.println(max);
	}
}
