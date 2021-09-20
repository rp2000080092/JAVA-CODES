class Insert

{
	public static void main(String[] args)
	{
		int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
		int a=Integer.parseInt(args[1]);
		int b=arr.length;
		for(int i=a;i<b;i++)
		{
			arr[b]=arr[b+1];
			b=b+1;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}