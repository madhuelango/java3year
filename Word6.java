import java.util.Scanner;
class Word6
{
public static void main(String args[])
{
int length=args.length;
if(length==0)
{
	System.out.println("please enter the month");
}
else
{
int in1=Integer.parseInt(args[0]);
switch(in1)
{
case 1:System.out.println("january");
         break;
case 2:System.out.println("febraury");
         break;
case 3:System.out.println("march");
         break;
case 4:System.out.println("april");
         break;
case 5:System.out.println("may");
         break;
case 6:System.out.println("june");
         break;
case 7:System.out.println("july");
         break;
case 8:System.out.println("august");
         break;
case 9:System.out.println("september");
         break;
case 10:System.out.println("October");
         break;
case 11:System.out.println("november");
         break;
case 12:System.out.println("December");
         break;
default:System.out.println("invalid month");
}
}
}
}

