class Number4
{
public static void main(String args[])
{
	int flag=0;

	for(int i=10;i<=99;i++)
	{
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
		
				flag=1;
			}
		}
		if(flag==0)
		{
		System.out.println("The prime number is="+i);
		}
		flag=0;
	}
}
}
