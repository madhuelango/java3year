import java.util.Scanner;
class Number6
{
public static void main(String args[])
{
	int sum=0;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	while(n>0)
	{
	int r=n%10;
	sum=sum+r;
	n=n/10;
	}
	System.out.println(sum);
}
}	
