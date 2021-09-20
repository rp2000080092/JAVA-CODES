class Range
{
	public static void main(String[] args)
	{
		int[] arr=new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			sum=sum+arr[i];
				
		}
		int flag=0;
		int sum2=0;
		int[] arr2=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==6)
			{
				flag=1;
				sum2=sum2+6;	
			}
			
			else if(arr[i]==7 && flag==1)
			{
				flag=0;
				sum2=sum2+7;
			}
			
			else if(flag==1)
			{
				sum2=sum2+arr[i];
			}
				
		}
		if(flag==0)
			System.out.println(sum-sum2);
		else
			System.out.println(sum);
	}

}