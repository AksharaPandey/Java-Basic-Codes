import java.util.Scanner;

public class function4 {

    public static void printfactorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial=1;
        for(int i=n;i>=i;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
       printfactorial(n);
        
    }
    
}
