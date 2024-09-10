import java.util.Scanner;

public class Practice9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.println("Weird");
        }else {
            System.out.println("Not weird");
        }
        if(n%2==0 && n<=5){ 
            System.out.println("Not Weird");
            if(n%2==0 && n>5 && n<=20){
                System.out.println("Weird");
                if(n%2==0 && n>=20) {
                    System.out.println("Not Weird");
                }
            }
        }
        
    }
}
