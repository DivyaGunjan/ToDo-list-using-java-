import java.util.*;
public class Prime {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the integer: ");
int a=sc.nextInt();
if(isPrime(a)) {
System.out.println(a+ " is a prime. ");
}
else{ 
System.out.println(a+ "is not a prime. ");
}
}
public static boolean isPrime(int a) {
if(a<=1) {
return false;
}
for(int i=0;i<=Math.sqrt(a);i++){
if(a%i ==0) { 
return false;
}
}
return true;
}
}