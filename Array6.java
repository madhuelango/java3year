class Array6
{
public static void main(String args[])
{
	
	int[] arr={65,66,67,68,69};
	int len=arr.length;
	char[] ar=new char[len];
	for(int i=0;i<len;i++)
	{
		char c=(char)arr[i];
		ar[i]=c;
	}
	System.out.print("Equiuvalent characters are:");
	for(int j=0;j<len;j++)
	{
	
		System.out.print(ar[j]+",");
	}
}
}