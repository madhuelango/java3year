import java.util.Scanner;
class Number8
{
public static void main(String args[])
{
	int count=0;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	while(n>0)
	{
	for(int i=1;i<=n;i++)
	{
		if((i%2==0)&&(i%3==0)&&(i%5==0))
		{
			count=count+1;
			if(count<=5)
			{
				System.out.println(i);
			}
		}

	}
        }
}
}	


