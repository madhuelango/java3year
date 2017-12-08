class Array11
{
public static void main(String args[])
{
	int max=0;
	int n=0;
	int[][] arr=new int[3][3];
	int len=args.length;
		for(int i=0;i<len/3;i++)
		{
			for(int j=0;j<len/3;j++)
			{
				int in1=Integer.parseInt(args[n]);
				n++;
				arr[i][j]=in1;
			}
		}
		for(int i=0;i<len/3;i++)
		{
			for(int j=0;j<len/3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<len/3;i++)
		{
			for(int j=0;j<len/3;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
		}
		System.out.println("maximum element is:"+max);
}
}