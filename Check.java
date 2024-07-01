import java.util.*;
class Check
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
if(Character.isLetterOrDigit(ch))
{
System.out.println("Alpha-Numeric");
if(Character.isLetter(ch))
{
System.out.println("Alphabet");
if(Character.isUpperCase(ch))
{
System.out.println("Uppercase");
}
else
{
System.out.println("lowercase");
}
}
else
{
System.out.println("Digit");
}
}
else
{
System.out.println("Special Symbol");
}
}
}