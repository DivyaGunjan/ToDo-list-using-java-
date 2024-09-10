import java.util.Scanner;
public class Practice5 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number: ");
int a=sc.nextInt();
System.out.println("Enter the second number: ");
int b=sc.nextInt();
System.out.println("Enter the third number: ");
int c=sc.nextInt();
System.out.println("Enter the fourth number: ");
int d=sc.nextInt();
if(a==b && b==c && c==d) {
System.out.println("All four are equal");
}
else {
System.out.println("Numbers are not equal");
}
}
}