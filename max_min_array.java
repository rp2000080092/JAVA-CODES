class MaxMin
{
	public static void main(String args[])
	{
		int[] source=new int[10];
		
		for(int i=0;i<source.length;i++)
		{
			int x=Integer.parseInt(args[i]);
			source[i]=x;
		}
		for(int i=0;i<source.length;i++)
		{
			System.out.println(source[i]);
		}
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int smax=source[0];
		int smin=source[0];
		for(int i=0;i<source.length;i++)
		{
			if(source[i]>max)
			{
				smax=max;
				max=source[i];
			}
			else if(source[i]<min)
			{
				smax=source[i];
			}
			if(min>source[i])
			{
				smin=min;
				min=source[i];
			}
			else if(smin>source[i])
			{
				smin=source[i];
			}
		}
		System.out.println("1st max="+max+" "+"1st min="+min+"\n");
		System.out.println("2 nd max="+ smax+"2 min="+ smin);
	}
}

