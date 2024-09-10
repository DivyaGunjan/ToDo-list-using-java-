import java.util.Scanner;
public bandh {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int breath=sc.nextInt;
        int height=sc.nextInt;
        try {
            if(breath<=0 || height<=0){
                throws new Exception("java.lang.Exception: Breath and height must be positive");
                
                }else{
                int area=breath * height ;
                System.out.println(area);
                
            }
            }catch(exception e) {
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}