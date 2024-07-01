import java.util.*;
class Strexample
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String str[]=new String[n];
for(int i=0;i<n;i++)
{
str[i]=s.next();
}
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(str[i].compareTo(str[j])>0)
{
String t=str[i];
str[i]=str[j];
str[j]=t;
}
}
}
for(int i=0;i<n;i++)
{
System.out.println(str[i]);
}
}
}