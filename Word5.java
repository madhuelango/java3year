import java.util.Scanner;
class Word5
{
public static void main(String args[])
{
Scanner o=new Scanner(System.in);
String s=o.next();
switch(s)
{
case "R":System.out.println("R->Red");
         break;
case "B":System.out.println("B->blue");
         break;
case "G":System.out.println("G->Red");
         break;
case "O":System.out.println("O->Orange");
         break;
case "Y":System.out.println("Y->Yellow");
         break;
case "W":System.out.println("W->White");
         break;
default:System.out.println("invalid colour");
}
}
}
