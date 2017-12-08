import java.util.Scanner;
class Number9
{
public static void main(String args[])
{
  	char choice=' ';
	Scanner s=new Scanner(System.in);
	do
	{
		System.out.println("ENTER THE NUMBER TO PERFORM OPERATION:");
		int n=s.nextInt();
		System.out.println("ENTER TWO NUMBERS");
		int n1=s.nextInt();
		int n2=s.nextInt();
		if(n==1)
		{
			int add=n1+n2;
			System.out.println(add);
		}
		if(n==2)
		{
			int sub=n1-n2;
			System.out.println(sub);
		}
		System.out.println("ENTER THE CHOICE");
		choice=s.next().charAt(0);
		continue;
	}
	while((choice=='y')||(choice=='Y'));
}
}
