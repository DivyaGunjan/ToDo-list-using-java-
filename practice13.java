import java.util.*;
public class practice13 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length in inches: ");
double inches=sc.nextDouble();
double meter=(0.0254 * inches);
System.out.println("The length in meter: " +meter);
}
}