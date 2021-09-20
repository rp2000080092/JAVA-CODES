class CopyArray
{
	public static void main(String args[])
	{
		int[] source={1,2,3,4,5};
		int[] des=new int[10];
		System.arraycopy(source,1,des,2,source.length);
		for(int i=0;i<des.length;i++)
			System.out.println(des[i]);
	}
}