class Pattern1
{
public static void main(String args[])
{
	int m=0;
	for(int i=10;i>0;i=i-2)
	{
		for(int j=1;j<i/2;j++)
		{
			System.out.print(" ");
			m=j;
		}
		for(int k=0;k<9-2*m;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		m=0;

	}
	for(int i=1;i<10;i=i+2)
	{
		for(int j=0;j<=i/2;j++)
		{
			System.out.print(" ");
			m=j;
		}
		for(int k=7-2*m;k>0;k--)
		{
			System.out.print("*");
		}
		System.out.println();

	}
}
}