class Insert_Into

{
	public static void main(String[] args)
	{
		int[] arr=new int[]{1,2,3,4,5,6,7,8,9,-1};
		int value=Integer.parseInt(args[0]);
		int pos=Integer.parseInt(args[1]);
		arr[9]=arr[pos-1];
		arr[pos-1]=value; 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}