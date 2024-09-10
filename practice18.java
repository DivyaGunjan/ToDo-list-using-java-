//convert a decimal to hexadecimal number 
import java.util.Scanner;
public class practice18 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the decimal number : ");
int dec=sc.nextInt();
char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
String hd= " ";
while(dec>0) {
int rem=( dec % 16 );
hd=hex[rem] + hd;
dec=dec/16;
}
System.out.println("Hexadecimal number is : " +hd+ " \n");
}
}