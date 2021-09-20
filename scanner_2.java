import java.util.Scanner;

class Temp4
{
	public static void main(String args[]) 
	{
		Scanner myObj=new Scanner(System.in);
		int flag=0;
		int sum=0;
		int[] source=new int[10];
		while(flag==0)
		{
			int num=myObj.nextInt();
			if(num==-1)
				flag=1;
			int count=0;
			double c=Math.sqrt(num);
			for(int i=2;i<=c;i++)
			{
				if(num%i==0)
				{
					count=1;
				}
			}
			if(count==0)
			{
				
				source[sum]=num;
				sum=sum+1;
				
			}
			
			if(sum==10)
			{
				flag=1;
			}
			
		}
		for(int i=0;i<source.length;i++)
		{
			System.out.println(source[i]);
		}
		
	}
}
	

