class Word7
{
public static void main(String args[])
{
	String s1=args[0];
	StringBuffer sb=new StringBuffer(s1);
	String s2=sb.reverse().toString();
	if(s1.equals(s2))
	{
		System.out.println("Palindrome");
	}
	else 
	{
		System.out.println("Not a palindrome");
	}
}
}
