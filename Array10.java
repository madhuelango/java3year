class Array10
{
public static void main(String args[])
{
	int n=0;
	int[][] arr=new int[2][2];
	int len=args.length;
	if(len<4)
	{
		System.out.println("Enter four numbers");
	}
	else
	{
		for(int i=0;i<len/2;i++)
		{
			for(int j=0;j<len/2;j++)
			{
				int in1=Integer.parseInt(args[n]);
				n++;
				arr[i][j]=in1;
			}
		}
	}
	System.out.println("the given 2*2 array is:");
	for(int i=0;i<len/2;i++)
	{
		for(int j=0;j<len/2;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("The sorted 2*2 array is");
	for(int i=(len/2)-1;i>=0;i--)
	{
		for(int j=(len/2)-1;j>=0;j--)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
}
}