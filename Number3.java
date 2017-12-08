import java.util.Scanner;
class Number3
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	int flag=0;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			flag=1;	
		}
	}
	if(flag==0)
	{
		System.out.println("PRIME NUMBER");
	}
	else
	{
		System.out.println("NOT A PRIME NUMBER");
	}
}
}
