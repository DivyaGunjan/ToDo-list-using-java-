// find the k largest elements in a given array.
import java.util.Scanner;
import java.util.Arrays;
 public class Exercise159 {
  public static void main(String arg[]) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of array: ");
   int n=sc.nextInt();
   int[] arr=new int[n];
    System.out.println("Enter the elemnets in the array: ");
    for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
} 
    System.out.println("Enter the value of k: ");
    int k=sc.nextInt();
    Arrays.sort(arr);
    int[] result=new int[k];
    for(int i=0;i<k;i++){ 
	result[i]=arr[n-1-i];
}
    System.out.println("The largest k elements are: ");
    for(int i=0;i<k;i++) {
	System.out.println(result[i] + " ");
}
}
}