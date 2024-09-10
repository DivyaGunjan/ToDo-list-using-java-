import java.uti.*;
class alpha
{ 
 public static void main(String args[])
{  char c,hc='A',lc='z';
 Scanner S1= new Scanner (System.in);
 char ch[]=new char[10];
 System.out.println("Enter ten characters");
 for(int i=0;i<10;i++)
 ch{i]=S1.next().charAt(0);
c= char[i];
 System.out.println(c);
 int l=(int)c;
{ 
if (l>(int)hc)
hc=(char)l;
if(l<(int)lc)
lc=(char)l;
}
{Sytem,out,println("highest character="+lc);
Sytem,out,println("lowest character="+hc);
}
}
}