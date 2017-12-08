class Array5
{
public static void main(String args[])
{
	int temp;
	int[] arr={4,2,8,1,9};
	int len=arr.length;
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("SORTED ORDER IS:");
	for(int k=0;k<len;k++)
	{
	System.out.println(arr[k]);
	}
}
}