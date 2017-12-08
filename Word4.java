class Word4
{
public static void main(String args[])
{
char ch1='M';
int in1=(int)ch1;
for(int i=97;i<=122;i++)
{
if(in1==i)
{
char ch12=Character.toUpperCase(ch1);
System.out.println(ch1+"->"+ch12);
}
}
for(int i=65;i<=90;i++)
{
if(in1==i)
{
char ch12=Character.toLowerCase(ch1);
System.out.println(ch1+"->"+ch12);
}
}
}
}
