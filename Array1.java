class Array1
{
public static void main(String args[])
{
	int[] arr={1,2,3,4,5};
	int len=arr.length;
	int sum=0;
	for(int i=0;i<len;i++)
	{
		sum=sum+arr[i];
	}
	int average=sum/len;
	System.out.println("sum:"+sum);
	System.out.println("average:"+average);
}
}