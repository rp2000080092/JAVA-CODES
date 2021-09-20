class Sort
{
	public static void main(String args[])
	{
		int[] arr={9,0,10,5,1,2};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int c=0;
				if(arr[i]>arr[j])
				{
					c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
			}
			System.out.println(arr[i]);
		}
	}
}