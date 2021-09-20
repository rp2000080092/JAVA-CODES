class Prime2
{
	public static void main(String args[])
	{
		
		for(int c=11 ;c<=99;c=c+2)
		{
			int count=0;
			double sq=Math.sqrt(c);
			for(int i=3;i<=sq;i++)
			{
				if(c%i==0){
					count=count+1;
					break;}	
			
			}
			if (count==0)
				System.out.println(c);
			
		}
	}
}