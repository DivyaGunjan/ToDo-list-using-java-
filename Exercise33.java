//compute the sum of an integer's digits
import java.util.Scanner;
public class Exercise33 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Input an integer: ");
int n=sc.nextInt();
int sum=0;
int OriginalNum=n;

if(n!=0){
int d=n%10;
sum+=d;
n/=10;
System.out.println("The sum of the digits is: " +sum);
}
}
}

