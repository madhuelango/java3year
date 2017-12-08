class Array7
{
public static void main(String args[])
{
	int temp;
	int count=0;
	int[] arr={12,34,12,45,67,89};
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
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(arr[i]==arr[j])
			{
				count=count+1;
				break;
				
				
			}
			else
			{
				count=0;
				
			}
		}
		if(count==0)
		{
			System.out.print(arr[i]+" ");
			
		
		}
		
	}
	
}
}
				
				
	