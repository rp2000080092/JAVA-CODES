class Second_MaxMin
{
        public static void main(String[] args)
        {
                int[] arr= new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			int x=Integer.parseInt(args[i]);
			arr[i]=x;
		}
                int max = arr[0];
                int secondmax = arr[0];
                int min = arr[0];
                int secondmin = arr[0];

                System.out.println("The given array is:" );
                for (int i = 0; i < arr.length; i++)
                {
                        System.out.print(arr[i]+" ");
                }
         
                for (int i = 0; i < arr.length; i++)
                {
                        if (arr[i] > max)
                        {
                                secondmax = max;
                                max = arr[i];
                        }
                        else if (arr[i] > secondmax)
                        {
                                secondmax = arr[i];
                        }
                }
                for (int i = 0; i < arr.length; i++)
                {
                        if (arr[i] < min)
                        {
                                secondmin = min;
                                min = arr[i];
                        }
                        else if (arr[i] < secondmin)
                        {
                                secondmin = arr[i];
                        }
                }
                System.out.println("\nSecond maximum number is: " + secondmax);
                System.out.println("\nSecond minimum number is: " + secondmin);
        }
}