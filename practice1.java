import java.util.Scanner;
public class practice1
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of an array: ");
int arr_size=0;
if(sc.hasNextInt()) {
arr_size=sc.nextInt();
}
int[] arr=new int[arr_size];
System.out.println("Enter the elements in the arrays: ");
arr_size=sc.hasNextInt();
int rows_length=arr.length;
int columns_length=arr[].length;
for(int i=0;i<rows_length;i++){
for(int j=0;j<columns_length;j++) {
if(arr[i][j]){
System.out.println("t");
}
else{
System.out.println("f");
}
}
System.out.println();
}
}
}

