class Number5
{
public static void main(String args[])
{
	int len=args.length;
	if(len==0)
	{
		System.out.println("Please enter the number");

	}
	int flag=0;
	int in1=Integer.parseInt(args[0]);
	if(in1==1)
	{
		System.out.println("1 is neither prime nor composite");
	}
	else if(in1==0)
	{
		System.out.println("0 is neither prime nor composite");
	}
	else
	{
		for(int j=2;j<=in1/2;j++)
		{
			if(in1%j==0)
			{
		
				flag=1;
			}
			
		}
		if(flag==0)
		{
			System.out.println(" prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}	
	}
}
}
