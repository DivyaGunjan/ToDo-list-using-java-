import java.util.Scanner;
public class Practice6 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number: ");
double a=sc.nextDouble();
System.out.println("Enter the second number: ");
double b=sc.nextDouble();
if(a>=0 && a<=1) {
	if(b>=0 && b<=1) {
System.out.print("True ");
}
}else{
System.out.print("False ");
}
}
}
