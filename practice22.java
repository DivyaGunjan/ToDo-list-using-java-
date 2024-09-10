// reverse a string 
import java.util.Scanner;
public class practice22{
public static void main(String args[]) {
Scanner sc= new Scanner(System.in);
String str=sc.nextLine();
String reversed=reverseString(str);
System.out.println("Original string: " +str);
System.out.println("Reversed string: " +reversed);
}
public static String reverseString(String str) {
StringBuilder reversed=new StringBuilder();
for(int i=str.length()-1;i>=0;i--){
reversed.append(str.charAt(i));
}
return reversed.toString();
}
}

