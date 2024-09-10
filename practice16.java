// convert integer in binary number 
import java.util.Scanner;
public class practice16 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println(" Enter the integer number : ");
int a=sc.nextInt();
String b=Integer.toBinaryString(a);
System.out.println("Binary representation of " +a+ " is: " +b);
}
}

