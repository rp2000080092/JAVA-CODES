class Duplicate

{
	public static void main(String[] args)
	{
		int[] arr=new int[]{12,34,12,45,67,89,12};
		int n=arr.length;
		int[] arr2=new int[n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
					continue;
				else
					arr2[i]=arr[i];
					break;
			}
		System.out.println(arr2[i]);
		}
		
		
		
	}
}