class Array9
{
public static void main(String args[])
{
	int sum=0;
	int pos1=0;
	int pos2=0;
	int[] arr={10,3,6,1,2,7,9};
	int len=arr.length;
	for(int i=0;i<len;i++)
	{
		if(arr[i]==6)
		{
			pos1=i;
			System.out.println("position of 6:"+pos1);
			
		}
		if(arr[i]==7)
		{
			pos2=i;
			System.out.println("position of 7:"+pos2);
		}
	}
	for(int i=0;i<len;i++)
	{
		if(pos1>pos2)
		{
			sum+=arr[i];
		}
		else
		{
			if((i>=0 && i<=pos1-1) || (i>=pos2+1 && i<=len-1))
			{
				sum+=arr[i];
			}
		}
	}
	System.out.println("sum:"+sum);
}
}
			