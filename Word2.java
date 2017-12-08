class Word2
{
public static void main(String args[])
{
char ch1='/';
if(Character.isDigit(ch1))
{
	System.out.println("DIGIT");
}
else if(Character.isLetter(ch1))
{
	System.out.println("ALPHA");
}
else
{
	System.out.println("SPECIAL CHARACTERS");
}
}
}
