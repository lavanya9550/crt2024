import java.util.*;
class Strreverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=s.next();
for(int i=s1.length()-1;i>=0;i--)
System.out.println(s1.charAt(i));
char s2[]=s1.toCharArray();
for(int i=s2.length-1;i>=0;i--)
System.out.print(s2[i]);
}
}