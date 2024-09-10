//fibonacci series 
import java.util.*;
public class Fibonacci {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int a,b,sum=0;
System.out.println("Enter the number of terms: " );
a=sc.nextInt();
for(b=0;b<=a;b++){
sum=sum+b;
System.out.print("Series: " +sum);
}
}
}
