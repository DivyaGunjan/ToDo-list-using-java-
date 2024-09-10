import java.util.Scanner;
public class practice12 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the temperature in Fahrenheit: ");
double a=sc.nextDouble();
double y=(a - 32) * 0.56;
System.out.println("The temperature in Celsius: " +y);
}
}
