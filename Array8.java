class Array8
{
public static void main(String args[])
{
	int temp;
	int dup=0;
	int[] arr={10,20,10,30,40,100,99};
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
	int max=1;
	int count=1;
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(arr[i]==arr[j])
			{
				count=count+1;
			}
			else
			{
				break;
			}
		}
		if(count>max)
		{
			max=count;
		        dup=arr[i];
		} 
       }
	
	System.out.print(dup);
	
}
}