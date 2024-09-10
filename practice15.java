// program to multiply two binary numbers
import java.util.Scanner;
public class practice15 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println(" Enter the first Binary number: ");
String a=sc.nextLine();
System.out.println(" Enter the second Binary number: ");
String b=sc.nextLine();
int c=Integer.parseInt(a,2);
int d=Integer.parseInt(b,2);
int p=(c * d);
String binaryProduct=Integer.toBinaryString(p);
System.out.println(" The product of two binary numbers are: " +binaryProduct);
}
}


