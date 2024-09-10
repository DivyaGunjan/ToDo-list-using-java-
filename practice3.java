import java.util.Scanner;
public class practice3 {
 
    public static void main(String[] args) {
        //three numbers
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first input: ");
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         
        int smallest;
         
        //find the smallest
        if(a<b) {
            if(c<a) {
                smallest = c;
            } else {
                smallest = a;
            }
        } else {
            if(b<c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }
         
        System.out.println(smallest + " is the smallest.");
    }
}
