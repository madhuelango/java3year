import java.util.Scanner;
class Array3
{
public static void main(String args[])
{
	int flag=0;
	int[] arr={1,4,34,56,7};
	int len=arr.length;
	System.out.println("enter the element to search:");
	Scanner s=new Scanner(System.in);
	int key=s.nextInt();
	for(int i=0;i<len;i++)
	{
		if(arr[i]==key)
		{
			System.out.println("index  of the key is:"+i);
			flag=1;
			
		}
	}
	if(flag==0)
	{
		System.out.println("-1");
		
	}

}
}