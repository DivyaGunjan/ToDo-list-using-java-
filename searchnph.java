import java.uti.Scanner;
class searchnph
{
public static void main(String args[])
{ int f;
Scanner S1= new Scanner(System.in);
String nm[]=new String[5];
int ph[]=new int[5];
System.out.println("Enter five names");
for(int i=0;i<5;i++)
nm[i]=S1.next();
System.out.println("Enter their no");
ph[i]=S1.nextInt();
System.out.println("Enter name whose no you want to search");
String s=S1.next();
{
if(nm[i].compareTo(s)==0)
{
f=1;
System.out.println(n[i]+" "+ph[i]);
break;
}
if(f==0)
System.out.println("name not found");
}
}
}